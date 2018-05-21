
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Detail {

    @Json(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
