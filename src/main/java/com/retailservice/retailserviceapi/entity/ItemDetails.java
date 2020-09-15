package com.retailservice.retailserviceapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemDetails {

    @JsonProperty("ItemName")
    private String ItemName;

    @JsonProperty("ItemId")
    private Number ItemId;

    @JsonProperty("Quantity")
    private Number Quantity;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public Number getItemId() {
        return ItemId;
    }

    public void setItemId(Number itemId) {
        ItemId = itemId;
    }

    public Number getQuantity() {
        return Quantity;
    }

    public void setQuantity(Number quantity) {
        Quantity = quantity;
    }
}
