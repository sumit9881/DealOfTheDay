package com.sumit.dealoftheday.viewmodels;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.List;

import static com.sumit.dealoftheday.viewmodels.Status.ERROR;
import static com.sumit.dealoftheday.viewmodels.Status.LOADING;
import static com.sumit.dealoftheday.viewmodels.Status.SUCCESS;

public class Response {
    public final Status status;
    public final List<BestDeal> data;
    public final Throwable error;


    private Response(Status status, @Nullable List<BestDeal> data, @Nullable Throwable error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public static Response loading() {
        return new Response(LOADING, null, null);
    }

    public static Response success(@NonNull List<BestDeal> data) {
        return new Response(SUCCESS, data, null);
    }

    public static Response error(@NonNull Throwable error) {
        return new Response(ERROR, null, error);
    }
}
