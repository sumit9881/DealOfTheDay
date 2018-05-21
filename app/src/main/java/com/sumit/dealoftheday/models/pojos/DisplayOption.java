
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class DisplayOption {

    @Json(name = "name")
    private String name;
    @Json(name = "enabled")
    private Boolean enabled;
    @Json(name = "value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
