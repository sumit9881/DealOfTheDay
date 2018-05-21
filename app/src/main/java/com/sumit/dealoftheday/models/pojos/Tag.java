
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Tag {

    @Json(name = "name")
    private String name;
    @Json(name = "uuid")
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
