package com.sumit.dealoftheday.di;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sumit.dealoftheday.App;
import com.sumit.dealoftheday.models.retrofit.GrouponApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private static final String BASE_URL = "https://partner-api.groupon.com/";

    @Provides
    @Singleton
    Retrofit provideRetrofit(GsonConverterFactory convertorFactory, OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .addConverterFactory(convertorFactory)
                .build();
    }

    @Provides
    @Singleton
    GrouponApi provideWeatherService(Retrofit retrofit) {
        return retrofit.create(GrouponApi.class);
    }

    @Provides
    @Singleton
    GsonConverterFactory provideConverterFactory(Gson gson) {
        return  GsonConverterFactory.create(gson);
    }

    @Provides
    @Singleton
    Gson proviesGson() {
        return new GsonBuilder().create();
    }

    @Provides
    @Singleton
    OkHttpClient providesOkHttpClient(Cache cache) {
        return new OkHttpClient.Builder().cache(cache).build();
    }

    @Provides
    @Singleton
    Cache providesCache(App application) {
        int cacheSize = 10 * 1024 * 1024;
        return new Cache(application.getCacheDir(), cacheSize);
    }

}
