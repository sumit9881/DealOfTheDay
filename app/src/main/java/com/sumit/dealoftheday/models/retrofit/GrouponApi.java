package com.sumit.dealoftheday.models.retrofit;

import com.sumit.dealoftheday.models.pojos.GrouponResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GrouponApi {

    @GET("deals.json")
    Single<GrouponResponse> getDeals(@Query("tsToken") String token, @Query("offset") int offset, @Query("limit") int limit);

}
