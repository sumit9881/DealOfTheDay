package com.sumit.dealoftheday.models.interactor;

import com.sumit.dealoftheday.Constants;
import com.sumit.dealoftheday.models.pojos.GrouponResponse;
import com.sumit.dealoftheday.models.repository.GrouponResultRepository;

import javax.inject.Inject;

import io.reactivex.Single;

public class LoadGrouponResponseUseCase {
    private final GrouponResultRepository mGrouponResultRepository;
    private int mOffset = 0;

    @Inject
    public LoadGrouponResponseUseCase(GrouponResultRepository grouponResultRepository) {
        this.mGrouponResultRepository = grouponResultRepository;
    }

    public Single<GrouponResponse> execute() {
        return mGrouponResultRepository.getGrouponDeals(mOffset, Constants.RESPONSE_LIMIT);
    }
}
