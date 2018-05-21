
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Child {

    @Json(name = "id")
    private String id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "friendlyName")
    private String friendlyName;

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

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

}
