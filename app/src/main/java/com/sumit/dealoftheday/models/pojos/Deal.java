
package com.sumit.dealoftheday.models.pojos;

import java.util.List;
import com.squareup.moshi.Json;

public class Deal {

    @Json(name = "id")
    private String id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "dealUrl")
    private String dealUrl;
    @Json(name = "title")
    private String title;
    @Json(name = "announcementTitle")
    private String announcementTitle;
    @Json(name = "shortAnnouncementTitle")
    private String shortAnnouncementTitle;
    @Json(name = "finePrint")
    private String finePrint;
    @Json(name = "highlightsHtml")
    private String highlightsHtml;
    @Json(name = "pitchHtml")
    private String pitchHtml;
    @Json(name = "soldQuantity")
    private Integer soldQuantity;
    @Json(name = "limitedQuantityRemaining")
    private Object limitedQuantityRemaining;
    @Json(name = "tippingPoint")
    private Integer tippingPoint;
    @Json(name = "soldQuantityMessage")
    private String soldQuantityMessage;
    @Json(name = "placeholderUrl")
    private String placeholderUrl;
    @Json(name = "grid4ImageUrl")
    private String grid4ImageUrl;
    @Json(name = "grid6ImageUrl")
    private String grid6ImageUrl;
    @Json(name = "largeImageUrl")
    private String largeImageUrl;
    @Json(name = "mediumImageUrl")
    private String mediumImageUrl;
    @Json(name = "smallImageUrl")
    private String smallImageUrl;
    @Json(name = "sidebarImageUrl")
    private String sidebarImageUrl;
    @Json(name = "status")
    private String status;
    @Json(name = "type")
    private String type;
    @Json(name = "accessType")
    private String accessType;
    @Json(name = "endAt")
    private String endAt;
    @Json(name = "startAt")
    private String startAt;
    @Json(name = "tippedAt")
    private String tippedAt;
    @Json(name = "areas")
    private List<Object> areas = null;
    @Json(name = "channels")
    private List<Channel> channels = null;
    @Json(name = "dealTypes")
    private List<DealType> dealTypes = null;
    @Json(name = "division")
    private Division division;
    @Json(name = "grouponRating")
    private Object grouponRating;
    @Json(name = "allowedInCart")
    private Boolean allowedInCart;
    @Json(name = "isInviteOnly")
    private Boolean isInviteOnly;
    @Json(name = "shippingAddressRequired")
    private Boolean shippingAddressRequired;
    @Json(name = "isOptionListComplete")
    private Boolean isOptionListComplete;
    @Json(name = "isMerchandisingDeal")
    private Boolean isMerchandisingDeal;
    @Json(name = "isNowDeal")
    private Boolean isNowDeal;
    @Json(name = "isSoldOut")
    private Boolean isSoldOut;
    @Json(name = "isTipped")
    private Boolean isTipped;
    @Json(name = "isTravelBookableDeal")
    private Boolean isTravelBookableDeal;
    @Json(name = "isGliveInventoryDeal")
    private Boolean isGliveInventoryDeal;
    @Json(name = "isAutoRefundEnabled")
    private Boolean isAutoRefundEnabled;
    @Json(name = "isGiftable")
    private Boolean isGiftable;
    @Json(name = "placementPriority")
    private String placementPriority;
    @Json(name = "redemptionLocation")
    private String redemptionLocation;
    @Json(name = "locationNote")
    private String locationNote;
    @Json(name = "vip")
    private String vip;
    @Json(name = "fulfillmentMethod")
    private Object fulfillmentMethod;
    @Json(name = "tags")
    private List<Tag> tags = null;
    @Json(name = "displayOptions")
    private List<DisplayOption> displayOptions = null;
    @Json(name = "textAd")
    private TextAd textAd;
    @Json(name = "merchant")
    private Merchant merchant;
    @Json(name = "options")
    private List<Option> options = null;
    @Json(name = "says")
    private Object says;
    @Json(name = "salesforceLink")
    private Object salesforceLink;

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

    public String getDealUrl() {
        return dealUrl;
    }

    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getShortAnnouncementTitle() {
        return shortAnnouncementTitle;
    }

    public void setShortAnnouncementTitle(String shortAnnouncementTitle) {
        this.shortAnnouncementTitle = shortAnnouncementTitle;
    }

    public String getFinePrint() {
        return finePrint;
    }

    public void setFinePrint(String finePrint) {
        this.finePrint = finePrint;
    }

    public String getHighlightsHtml() {
        return highlightsHtml;
    }

    public void setHighlightsHtml(String highlightsHtml) {
        this.highlightsHtml = highlightsHtml;
    }

    public String getPitchHtml() {
        return pitchHtml;
    }

    public void setPitchHtml(String pitchHtml) {
        this.pitchHtml = pitchHtml;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public Object getLimitedQuantityRemaining() {
        return limitedQuantityRemaining;
    }

    public void setLimitedQuantityRemaining(Object limitedQuantityRemaining) {
        this.limitedQuantityRemaining = limitedQuantityRemaining;
    }

    public Integer getTippingPoint() {
        return tippingPoint;
    }

    public void setTippingPoint(Integer tippingPoint) {
        this.tippingPoint = tippingPoint;
    }

    public String getSoldQuantityMessage() {
        return soldQuantityMessage;
    }

    public void setSoldQuantityMessage(String soldQuantityMessage) {
        this.soldQuantityMessage = soldQuantityMessage;
    }

    public String getPlaceholderUrl() {
        return placeholderUrl;
    }

    public void setPlaceholderUrl(String placeholderUrl) {
        this.placeholderUrl = placeholderUrl;
    }

    public String getGrid4ImageUrl() {
        return grid4ImageUrl;
    }

    public void setGrid4ImageUrl(String grid4ImageUrl) {
        this.grid4ImageUrl = grid4ImageUrl;
    }

    public String getGrid6ImageUrl() {
        return grid6ImageUrl;
    }

    public void setGrid6ImageUrl(String grid6ImageUrl) {
        this.grid6ImageUrl = grid6ImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getSidebarImageUrl() {
        return sidebarImageUrl;
    }

    public void setSidebarImageUrl(String sidebarImageUrl) {
        this.sidebarImageUrl = sidebarImageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getTippedAt() {
        return tippedAt;
    }

    public void setTippedAt(String tippedAt) {
        this.tippedAt = tippedAt;
    }

    public List<Object> getAreas() {
        return areas;
    }

    public void setAreas(List<Object> areas) {
        this.areas = areas;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public List<DealType> getDealTypes() {
        return dealTypes;
    }

    public void setDealTypes(List<DealType> dealTypes) {
        this.dealTypes = dealTypes;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Object getGrouponRating() {
        return grouponRating;
    }

    public void setGrouponRating(Object grouponRating) {
        this.grouponRating = grouponRating;
    }

    public Boolean getAllowedInCart() {
        return allowedInCart;
    }

    public void setAllowedInCart(Boolean allowedInCart) {
        this.allowedInCart = allowedInCart;
    }

    public Boolean getIsInviteOnly() {
        return isInviteOnly;
    }

    public void setIsInviteOnly(Boolean isInviteOnly) {
        this.isInviteOnly = isInviteOnly;
    }

    public Boolean getShippingAddressRequired() {
        return shippingAddressRequired;
    }

    public void setShippingAddressRequired(Boolean shippingAddressRequired) {
        this.shippingAddressRequired = shippingAddressRequired;
    }

    public Boolean getIsOptionListComplete() {
        return isOptionListComplete;
    }

    public void setIsOptionListComplete(Boolean isOptionListComplete) {
        this.isOptionListComplete = isOptionListComplete;
    }

    public Boolean getIsMerchandisingDeal() {
        return isMerchandisingDeal;
    }

    public void setIsMerchandisingDeal(Boolean isMerchandisingDeal) {
        this.isMerchandisingDeal = isMerchandisingDeal;
    }

    public Boolean getIsNowDeal() {
        return isNowDeal;
    }

    public void setIsNowDeal(Boolean isNowDeal) {
        this.isNowDeal = isNowDeal;
    }

    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    public Boolean getIsTipped() {
        return isTipped;
    }

    public void setIsTipped(Boolean isTipped) {
        this.isTipped = isTipped;
    }

    public Boolean getIsTravelBookableDeal() {
        return isTravelBookableDeal;
    }

    public void setIsTravelBookableDeal(Boolean isTravelBookableDeal) {
        this.isTravelBookableDeal = isTravelBookableDeal;
    }

    public Boolean getIsGliveInventoryDeal() {
        return isGliveInventoryDeal;
    }

    public void setIsGliveInventoryDeal(Boolean isGliveInventoryDeal) {
        this.isGliveInventoryDeal = isGliveInventoryDeal;
    }

    public Boolean getIsAutoRefundEnabled() {
        return isAutoRefundEnabled;
    }

    public void setIsAutoRefundEnabled(Boolean isAutoRefundEnabled) {
        this.isAutoRefundEnabled = isAutoRefundEnabled;
    }

    public Boolean getIsGiftable() {
        return isGiftable;
    }

    public void setIsGiftable(Boolean isGiftable) {
        this.isGiftable = isGiftable;
    }

    public String getPlacementPriority() {
        return placementPriority;
    }

    public void setPlacementPriority(String placementPriority) {
        this.placementPriority = placementPriority;
    }

    public String getRedemptionLocation() {
        return redemptionLocation;
    }

    public void setRedemptionLocation(String redemptionLocation) {
        this.redemptionLocation = redemptionLocation;
    }

    public String getLocationNote() {
        return locationNote;
    }

    public void setLocationNote(String locationNote) {
        this.locationNote = locationNote;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public Object getFulfillmentMethod() {
        return fulfillmentMethod;
    }

    public void setFulfillmentMethod(Object fulfillmentMethod) {
        this.fulfillmentMethod = fulfillmentMethod;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<DisplayOption> getDisplayOptions() {
        return displayOptions;
    }

    public void setDisplayOptions(List<DisplayOption> displayOptions) {
        this.displayOptions = displayOptions;
    }

    public TextAd getTextAd() {
        return textAd;
    }

    public void setTextAd(TextAd textAd) {
        this.textAd = textAd;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Object getSays() {
        return says;
    }

    public void setSays(Object says) {
        this.says = says;
    }

    public Object getSalesforceLink() {
        return salesforceLink;
    }

    public void setSalesforceLink(Object salesforceLink) {
        this.salesforceLink = salesforceLink;
    }

}
