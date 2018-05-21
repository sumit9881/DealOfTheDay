
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Icon {

    @Json(name = "url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
