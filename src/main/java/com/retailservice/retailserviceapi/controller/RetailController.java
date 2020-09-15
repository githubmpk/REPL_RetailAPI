package com.retailservice.retailserviceapi.controller;

import com.retailservice.retailserviceapi.entity.StoreData;
import com.retailservice.retailserviceapi.repository.RetailRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.EmptyStackException;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class RetailController {
    @Autowired
    private RetailRepository retailRepository;

    @GetMapping("/retaildata")
    public List<StoreData> getStoreData() {
        return retailRepository.findAll();
    }

    @PostMapping("/retaildata")
    public StoreData storeRetailData(@RequestBody StoreData storeData) {
        return retailRepository.save(storeData);
    }

    @GetMapping("/retaildata/{id}")
    StoreData getById(@PathVariable Long id) {

        return retailRepository.findById(id)
                .orElseThrow(() -> new EmptyStackException());
    }

    @DeleteMapping("/retaildata/{id}")
    void deleteRetailData(@PathVariable Long id) {
        retailRepository.deleteById(id);
    }

}
