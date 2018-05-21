package com.sumit.dealoftheday.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.sumit.dealoftheday.models.interactor.LoadGrouponResponseUseCase;
import com.sumit.dealoftheday.models.pojos.Deal;
import com.sumit.dealoftheday.rxjava.SchedulersFacade;

import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class GrouponDealViewModel extends ViewModel {
    private final LoadGrouponResponseUseCase mLoadGrouponResponseUseCase;

    private final SchedulersFacade mSchedulersFacade;

    private final CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    private final MutableLiveData<Response> mResponse = new MutableLiveData<>();

    public GrouponDealViewModel(LoadGrouponResponseUseCase loadGrouponResponseUseCase, SchedulersFacade schedulersFacade) {
        this.mLoadGrouponResponseUseCase = loadGrouponResponseUseCase;
        this.mSchedulersFacade = schedulersFacade;
    }

    @Override
    protected void onCleared() {
        if (mCompositeDisposable.isDisposed()) {
            mCompositeDisposable.dispose();
        }

    }


    public void loadGrouponResponse() {

        Disposable d = mLoadGrouponResponseUseCase.execute()
                .subscribeOn(mSchedulersFacade.io())
                .observeOn(mSchedulersFacade.ui())
                .doOnSubscribe(s -> mResponse.setValue(Response.loading()))
                .toObservable()
                .map(s -> s.getDeals())
                .flatMap(items -> Observable.fromIterable(items))
                .map(item -> getBestDeals(item))
                .toList()
                .subscribe(
                        deals -> mResponse.setValue(Response.success(deals)),
                        throwable -> Response.error(throwable)
                );
        mCompositeDisposable.add(d);
    }

    private BestDeal getBestDeals(Deal deal) {
        BestDeal b = new BestDeal();
        b.setDealUrl(deal.getDealUrl());
        b.setLargeImageUrl(deal.getLargeImageUrl());
        b.setShortAnnouncementTitle(deal.getShortAnnouncementTitle());
        b.setAnnouncementTitle(deal.getAnnouncementTitle());

        return b;
    }

    public MutableLiveData<Response> response() {
        return mResponse;
    }
}
