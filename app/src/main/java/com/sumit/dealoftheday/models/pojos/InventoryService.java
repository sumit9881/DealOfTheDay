
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class InventoryService {

    @Json(name = "id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
