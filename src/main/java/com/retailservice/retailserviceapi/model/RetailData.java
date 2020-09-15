//package com.retailservice.retailserviceapi.model;
//
//import com.retailservice.retailserviceapi.entity.StoreData;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "retaildata")
//public class RetailData {
//    private long id;
//    private List<StoreData> storeData;
//
//    public RetailData() {
//
//    }
//
//    public RetailData(List<StoreData> storeData) {
//        this.storeData =storeData;
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    @Column(name = "store_data", nullable = false)
//    public List<StoreData> getStoreData() {
//        return storeData;
//    }
//
//    public void setStoreData(List<StoreData> storeData) {
//        this.storeData = storeData;
//    }
//}
