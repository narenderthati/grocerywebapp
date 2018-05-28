package com.grocerystore.grocerywebapp.common.modal;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "appmenu")
public class AppMenu {

    private String displayName;

    private String url;

    private int displayOrder;


    public String getDisplayName() {
        return displayName;
    }

    public String getUrl() {
        return url;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    AppMenu(){}

    AppMenu(String displayName, String url, int displayOrder) {
        this.displayName = displayName;
        this.url = url;
        this.displayOrder = displayOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppMenu)) return false;
        AppMenu appMenu = (AppMenu) o;
        return getDisplayOrder() == appMenu.getDisplayOrder() &&
                Objects.equals(getDisplayName(), appMenu.getDisplayName()) &&
                Objects.equals(getUrl(), appMenu.getUrl());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDisplayName(), getUrl(), getDisplayOrder());
    }
}
