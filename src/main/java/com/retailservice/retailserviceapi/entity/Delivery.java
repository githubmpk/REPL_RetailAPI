package com.retailservice.retailserviceapi.entity;

public class Delivery {


    private String itemName;

    private Integer itemId;

    private Integer quantity;


    /**
     * No args constructor for use in serialization
     *
     */
    public Delivery() {
    }

    /**
     *
     * @param itemId
     * @param itemName
     * @param quantity
     */
    public Delivery(String itemName, Integer itemId, Integer quantity) {
        super();
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
    }


    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public Integer getItemId() {
        return itemId;
    }


    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
