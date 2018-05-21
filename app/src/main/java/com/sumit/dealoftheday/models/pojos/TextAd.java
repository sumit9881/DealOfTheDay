
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class TextAd {

    @Json(name = "line1")
    private String line1;
    @Json(name = "line2")
    private String line2;
    @Json(name = "headline")
    private String headline;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

}
