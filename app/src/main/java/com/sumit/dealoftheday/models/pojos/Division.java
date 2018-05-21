
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Division {

    @Json(name = "id")
    private String id;
    @Json(name = "name")
    private String name;
    @Json(name = "timezone")
    private String timezone;
    @Json(name = "timezoneOffsetInSeconds")
    private Integer timezoneOffsetInSeconds;
    @Json(name = "timezoneIdentifier")
    private String timezoneIdentifier;
    @Json(name = "lat")
    private Double lat;
    @Json(name = "lng")
    private Double lng;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getTimezoneOffsetInSeconds() {
        return timezoneOffsetInSeconds;
    }

    public void setTimezoneOffsetInSeconds(Integer timezoneOffsetInSeconds) {
        this.timezoneOffsetInSeconds = timezoneOffsetInSeconds;
    }

    public String getTimezoneIdentifier() {
        return timezoneIdentifier;
    }

    public void setTimezoneIdentifier(String timezoneIdentifier) {
        this.timezoneIdentifier = timezoneIdentifier;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}
