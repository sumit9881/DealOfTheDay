
package com.sumit.dealoftheday.models.pojos;

import java.util.List;
import com.squareup.moshi.Json;

public class RedemptionLocation {

    @Json(name = "name")
    private String name;
    @Json(name = "streetAddress1")
    private String streetAddress1;
    @Json(name = "streetAddress2")
    private Object streetAddress2;
    @Json(name = "state")
    private String state;
    @Json(name = "city")
    private String city;
    @Json(name = "neighborhood")
    private String neighborhood;
    @Json(name = "postalCode")
    private String postalCode;
    @Json(name = "country")
    private String country;
    @Json(name = "phoneNumber")
    private String phoneNumber;
    @Json(name = "id")
    private Integer id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "ordering")
    private Integer ordering;
    @Json(name = "openHours")
    private List<OpenHour> openHours = null;
    @Json(name = "placeAttributes")
    private List<PlaceAttribute> placeAttributes = null;
    @Json(name = "lat")
    private Double lat;
    @Json(name = "lng")
    private Double lng;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public Object getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(Object streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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

    public Integer getOrdering() {
        return ordering;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    public List<OpenHour> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(List<OpenHour> openHours) {
        this.openHours = openHours;
    }

    public List<PlaceAttribute> getPlaceAttributes() {
        return placeAttributes;
    }

    public void setPlaceAttributes(List<PlaceAttribute> placeAttributes) {
        this.placeAttributes = placeAttributes;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}
