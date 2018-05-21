
package com.sumit.dealoftheday.models.pojos;

import java.util.List;
import com.squareup.moshi.Json;

public class PlaceAttribute {

    @Json(name = "id")
    private String id;
    @Json(name = "uuid")
    private String uuid;
    @Json(name = "friendlyName")
    private String friendlyName;
    @Json(name = "icon")
    private Icon icon;
    @Json(name = "children")
    private List<Child> children = null;

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

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

}
