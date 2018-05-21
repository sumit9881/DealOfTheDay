
package com.sumit.dealoftheday.models.pojos;

import java.util.List;
import com.squareup.moshi.Json;

public class GrouponResponse {

    @Json(name = "deals")
    private List<Deal> deals = null;
    @Json(name = "facets")
    private List<Object> facets = null;
    @Json(name = "pagination")
    private Pagination pagination;
    @Json(name = "relevanceService")
    private RelevanceService relevanceService;
    @Json(name = "dealSubsetAttributes")
    private List<Object> dealSubsetAttributes = null;

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public List<Object> getFacets() {
        return facets;
    }

    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public RelevanceService getRelevanceService() {
        return relevanceService;
    }

    public void setRelevanceService(RelevanceService relevanceService) {
        this.relevanceService = relevanceService;
    }

    public List<Object> getDealSubsetAttributes() {
        return dealSubsetAttributes;
    }

    public void setDealSubsetAttributes(List<Object> dealSubsetAttributes) {
        this.dealSubsetAttributes = dealSubsetAttributes;
    }

}
