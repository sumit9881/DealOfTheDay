
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class SpecificAttributes {

    @Json(name = "takeoutDelivery")
    private TakeoutDelivery takeoutDelivery;

    public TakeoutDelivery getTakeoutDelivery() {
        return takeoutDelivery;
    }

    public void setTakeoutDelivery(TakeoutDelivery takeoutDelivery) {
        this.takeoutDelivery = takeoutDelivery;
    }

}
