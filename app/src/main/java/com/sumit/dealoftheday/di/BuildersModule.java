package com.sumit.dealoftheday.di;

import com.sumit.dealoftheday.views.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = LobbyModule.class)
    abstract MainActivity bindMainActivity();

    // Add bindings for other sub-components here
}