package com.retailservice.retailserviceapi.controller;

import com.retailservice.retailserviceapi.model.RetailData;
import com.retailservice.retailserviceapi.repository.RetailRepository;
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
    public List<RetailData> getStoreData() {
        return retailRepository.findAll();
    }

    @PostMapping("/retaildata")
    public RetailData storeRetailData(@RequestBody RetailData storeData) {
        return retailRepository.save(storeData);
    }

    @GetMapping("/retaildata/{id}")
    RetailData getById(@PathVariable String id) {

        return retailRepository.findById(id)
                .orElseThrow(() -> new EmptyStackException());
    }

    @DeleteMapping("/retaildata/{id}")
    void deleteRetailData(@PathVariable String id) {
        retailRepository.deleteById(id);
    }

}
