
package com.sumit.dealoftheday.models.pojos;

import com.squareup.moshi.Json;

public class Price {

    @Json(name = "amount")
    private Integer amount;
    @Json(name = "currencyCode")
    private String currencyCode;
    @Json(name = "formattedAmount")
    private String formattedAmount;
    @Json(name = "currencyExponent")
    private Integer currencyExponent;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getFormattedAmount() {
        return formattedAmount;
    }

    public void setFormattedAmount(String formattedAmount) {
        this.formattedAmount = formattedAmount;
    }

    public Integer getCurrencyExponent() {
        return currencyExponent;
    }

    public void setCurrencyExponent(Integer currencyExponent) {
        this.currencyExponent = currencyExponent;
    }

}
