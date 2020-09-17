package com.retailservice.retailserviceapi.model;

import com.retailservice.retailserviceapi.entity.Delivery;
import com.retailservice.retailserviceapi.entity.Refund;
import com.retailservice.retailserviceapi.entity.Sale;
import com.retailservice.retailserviceapi.util.StringListConverter;

import javax.persistence.*;
import java.util.List;

@Entity

public class RetailData {

    private @Id @GeneratedValue Long id;
    private Integer storeId;
    @Convert(converter = StringListConverter.class)
    private List<Sale> sale;
    @Convert(converter = StringListConverter.class)
    private List<Refund> refund;
    @Convert(converter = StringListConverter.class)
    private List<Delivery> delivery;


    /**
     * No args constructor for use in serialization
     *
     */
    public RetailData() {
    }

    /**
     *
     * @param delivery
     * @param sale
     * @param storeId
     * @param refund
     */
    public RetailData(Integer storeId, List<Sale> sale, List<Refund> refund, List<Delivery> delivery) {
        super();
        this.storeId = storeId;
        this.sale = sale;
        this.refund = refund;
        this.delivery = delivery;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }


    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public List<Sale> getSale() {
        return sale;
    }


    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }


    public List<Refund> getRefund() {
        return refund;
    }


    public void setRefund(List<Refund> refund) {
        this.refund = refund;
    }

    public List<Delivery> getDelivery() {
        return delivery;
    }


    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }


}