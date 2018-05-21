
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Channel {

    @Json(name = "id")
    private String id;
    @Json(name = "name")
    private String name;

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

}
