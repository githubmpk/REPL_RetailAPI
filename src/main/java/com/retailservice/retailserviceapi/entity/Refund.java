package com.retailservice.retailserviceapi.entity;

public class Refund {


    private String itemName;
    private Integer itemId;
    private Integer quantity;

    /**
     * No args constructor for use in serialization
     *
     */
    public Refund() {
    }

    /**
     *
     * @param itemId
     * @param itemName
     * @param quantity
     */
    public Refund(String itemName, Integer itemId, Integer quantity) {
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
