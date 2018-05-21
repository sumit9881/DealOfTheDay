
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class RelevanceService {

    @Json(name = "persistentRanking")
    private String persistentRanking;
    @Json(name = "context")
    private String context;
    @Json(name = "treatment")
    private String treatment;

    public String getPersistentRanking() {
        return persistentRanking;
    }

    public void setPersistentRanking(String persistentRanking) {
        this.persistentRanking = persistentRanking;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

}
