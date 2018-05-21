package com.sumit.dealoftheday.models.repository;

import com.sumit.dealoftheday.Constants;
import com.sumit.dealoftheday.models.pojos.GrouponResponse;
import com.sumit.dealoftheday.models.retrofit.GrouponApi;

import javax.inject.Inject;

import io.reactivex.Single;
import retrofit2.http.Query;

public class GrouponResultRepository {

    @Inject
    public GrouponApi grouponApi;

    @Inject
    public GrouponResultRepository(GrouponApi grouponApi) {
           this.grouponApi= grouponApi;
    }


    public Single<GrouponResponse> getGrouponDeals(int offset, int limit) {
        return grouponApi.getDeals(Constants.AFFILIATE_ID, offset, limit);
    }
}
