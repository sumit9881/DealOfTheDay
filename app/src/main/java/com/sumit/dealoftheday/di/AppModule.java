package com.sumit.dealoftheday.di;

import android.content.Context;

import com.sumit.dealoftheday.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

}
