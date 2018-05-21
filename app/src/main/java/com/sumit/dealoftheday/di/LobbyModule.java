package com.sumit.dealoftheday.di;


import com.sumit.dealoftheday.models.interactor.LoadGrouponResponseUseCase;
import com.sumit.dealoftheday.models.repository.GrouponResultRepository;
import com.sumit.dealoftheday.models.retrofit.GrouponApi;
import com.sumit.dealoftheday.rxjava.SchedulersFacade;
import com.sumit.dealoftheday.viewmodels.GrouponDealViewModelFactory;

import dagger.Module;
import dagger.Provides;

/**
 * Define LobbyActivity-specific dependencies here.
 */
@Module
public class LobbyModule {

    @Provides
    GrouponResultRepository provideLobbyGreetingRepository(GrouponApi api) {
        return new GrouponResultRepository(api);
    }

    @Provides
    GrouponDealViewModelFactory provideGrouponDealViewModelFactory(LoadGrouponResponseUseCase loadGrouponResponseUseCase,
                                                             SchedulersFacade schedulersFacade) {
        return new GrouponDealViewModelFactory(loadGrouponResponseUseCase, schedulersFacade);
    }
}