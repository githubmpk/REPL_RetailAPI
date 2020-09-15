package com.retailservice.retailserviceapi.repository;

import com.retailservice.retailserviceapi.entity.StoreData;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository

public interface RetailRepository extends JpaRepository<StoreData, Long> {

    }
