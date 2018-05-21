
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Merchant {

    @Json(name = "id")
    private String id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "name")
    private String name;
    @Json(name = "websiteUrl")
    private String websiteUrl;
    @Json(name = "facebookUrl")
    private Object facebookUrl;
    @Json(name = "twitterUrl")
    private Object twitterUrl;
    @Json(name = "ratings")
    private Object ratings;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Object getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(Object facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public Object getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(Object twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public Object getRatings() {
        return ratings;
    }

    public void setRatings(Object ratings) {
        this.ratings = ratings;
    }

}
