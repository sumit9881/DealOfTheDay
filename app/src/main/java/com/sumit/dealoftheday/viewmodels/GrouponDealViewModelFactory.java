package com.sumit.dealoftheday.viewmodels;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.sumit.dealoftheday.models.interactor.LoadGrouponResponseUseCase;
import com.sumit.dealoftheday.rxjava.SchedulersFacade;

public class GrouponDealViewModelFactory implements ViewModelProvider.Factory {

    private final LoadGrouponResponseUseCase mLoadGrouponResponseUseCase;
    private final SchedulersFacade mSchedulerFacade;

    public GrouponDealViewModelFactory(LoadGrouponResponseUseCase loadGrouponResponseUseCase, SchedulersFacade schedulersFacade) {
        mLoadGrouponResponseUseCase = loadGrouponResponseUseCase;
        mSchedulerFacade = schedulersFacade;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(GrouponDealViewModel.class)) {
            return (T) new GrouponDealViewModel(mLoadGrouponResponseUseCase, mSchedulerFacade);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");    }
}
