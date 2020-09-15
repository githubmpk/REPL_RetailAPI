package com.retailservice.retailserviceapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StoreData {

    @JsonProperty("StoreId")
    private Number StoreId;

    @JsonProperty("Refund")
    private List<ItemDetails> Refund;

    @JsonProperty("Delivery")
    private List<ItemDetails> Delivery;

    @JsonProperty("Sale")
    private List<ItemDetails> Sale;

    public StoreData(Number storeId, List<ItemDetails> refund, List<ItemDetails> delivery, List<ItemDetails> sale) {
        StoreId = storeId;
        Refund = refund;
        Delivery = delivery;
        Sale = sale;
    }

    public Number getStoreId() {
        return StoreId;
    }

    public void setStoreId(Number storeId) {
        StoreId = storeId;
    }

    public List<ItemDetails> getRefund() {
        return Refund;
    }

    public void setRefund(List<ItemDetails> refund) {
        Refund = refund;
    }

    public List<ItemDetails> getDelivery() {
        return Delivery;
    }

    public void setDelivery(List<ItemDetails> delivery) {
        Delivery = delivery;
    }

    public List<ItemDetails> getSale() {
        return Sale;
    }

    public void setSale(List<ItemDetails> sale) {
        Sale = sale;
    }
}
