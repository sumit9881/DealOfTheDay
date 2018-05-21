
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Pagination {

    @Json(name = "offset")
    private Integer offset;
    @Json(name = "count")
    private Integer count;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
