
package com.sumit.dealoftheday.models.pojos;

import java.util.List;
import com.squareup.moshi.Json;

public class Option {

    @Json(name = "id")
    private Integer id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "bookable")
    private Object bookable;
    @Json(name = "buyUrl")
    private String buyUrl;
    @Json(name = "customField")
    private Object customField;
    @Json(name = "details")
    private List<Detail> details = null;
    @Json(name = "discount")
    private Discount discount;
    @Json(name = "discountPercent")
    private Integer discountPercent;
    @Json(name = "endAt")
    private String endAt;
    @Json(name = "expiresAt")
    private String expiresAt;
    @Json(name = "expiresInDays")
    private Integer expiresInDays;
    @Json(name = "externalUrl")
    private Object externalUrl;
    @Json(name = "isLimitedQuantity")
    private Boolean isLimitedQuantity;
    @Json(name = "isSoldOut")
    private Boolean isSoldOut;
    @Json(name = "maximumPurchaseQuantity")
    private Integer maximumPurchaseQuantity;
    @Json(name = "minimumPurchaseQuantity")
    private Integer minimumPurchaseQuantity;
    @Json(name = "price")
    private Price price;
    @Json(name = "traits")
    private List<Object> traits = null;
    @Json(name = "redemptionLocations")
    private List<RedemptionLocation> redemptionLocations = null;
    @Json(name = "soldQuantity")
    private Integer soldQuantity;
    @Json(name = "soldQuantityMessage")
    private String soldQuantityMessage;
    @Json(name = "specificAttributes")
    private SpecificAttributes specificAttributes;
    @Json(name = "status")
    private String status;
    @Json(name = "title")
    private String title;
    @Json(name = "value")
    private Value value;
    @Json(name = "inventoryService")
    private InventoryService inventoryService;
    @Json(name = "customFields")
    private List<Object> customFields = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getBookable() {
        return bookable;
    }

    public void setBookable(Object bookable) {
        this.bookable = bookable;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public Object getCustomField() {
        return customField;
    }

    public void setCustomField(Object customField) {
        this.customField = customField;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Integer getExpiresInDays() {
        return expiresInDays;
    }

    public void setExpiresInDays(Integer expiresInDays) {
        this.expiresInDays = expiresInDays;
    }

    public Object getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(Object externalUrl) {
        this.externalUrl = externalUrl;
    }

    public Boolean getIsLimitedQuantity() {
        return isLimitedQuantity;
    }

    public void setIsLimitedQuantity(Boolean isLimitedQuantity) {
        this.isLimitedQuantity = isLimitedQuantity;
    }

    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    public Integer getMaximumPurchaseQuantity() {
        return maximumPurchaseQuantity;
    }

    public void setMaximumPurchaseQuantity(Integer maximumPurchaseQuantity) {
        this.maximumPurchaseQuantity = maximumPurchaseQuantity;
    }

    public Integer getMinimumPurchaseQuantity() {
        return minimumPurchaseQuantity;
    }

    public void setMinimumPurchaseQuantity(Integer minimumPurchaseQuantity) {
        this.minimumPurchaseQuantity = minimumPurchaseQuantity;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Object> getTraits() {
        return traits;
    }

    public void setTraits(List<Object> traits) {
        this.traits = traits;
    }

    public List<RedemptionLocation> getRedemptionLocations() {
        return redemptionLocations;
    }

    public void setRedemptionLocations(List<RedemptionLocation> redemptionLocations) {
        this.redemptionLocations = redemptionLocations;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getSoldQuantityMessage() {
        return soldQuantityMessage;
    }

    public void setSoldQuantityMessage(String soldQuantityMessage) {
        this.soldQuantityMessage = soldQuantityMessage;
    }

    public SpecificAttributes getSpecificAttributes() {
        return specificAttributes;
    }

    public void setSpecificAttributes(SpecificAttributes specificAttributes) {
        this.specificAttributes = specificAttributes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public InventoryService getInventoryService() {
        return inventoryService;
    }

    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public List<Object> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

}
