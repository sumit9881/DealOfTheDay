
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class OpenHour {

    @Json(name = "dayOfWeek")
    private Integer dayOfWeek;
    @Json(name = "startTime")
    private String startTime;
    @Json(name = "endTime")
    private String endTime;
    @Json(name = "openNow")
    private Boolean openNow;
    @Json(name = "displayTime")
    private String displayTime;

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Boolean getOpenNow() {
        return openNow;
    }

    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }

    public String getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(String displayTime) {
        this.displayTime = displayTime;
    }

}
