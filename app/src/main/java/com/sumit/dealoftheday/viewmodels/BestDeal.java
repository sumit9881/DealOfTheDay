package com.sumit.dealoftheday.viewmodels;

public class BestDeal {

    private String shortAnnouncementTitle;
    private String announcementTitle;
    private String dealUrl;

    public String getShortAnnouncementTitle() {
        return shortAnnouncementTitle;
    }

    public void setShortAnnouncementTitle(String shortAnnouncementTitle) {
        this.shortAnnouncementTitle = shortAnnouncementTitle;
    }

    public String getAnnouncementTitle() {
        return announcementTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.announcementTitle = announcementTitle;
    }

    public String getDealUrl() {
        return dealUrl;
    }

    public void setDealUrl(String dealUrl) {
        this.dealUrl = dealUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String largeImageUrl;
    private String price;

}
