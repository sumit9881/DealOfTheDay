
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class TakeoutDelivery {

    @Json(name = "takeout")
    private Boolean takeout;
    @Json(name = "delivery")
    private Boolean delivery;

    public Boolean getTakeout() {
        return takeout;
    }

    public void setTakeout(Boolean takeout) {
        this.takeout = takeout;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

}
