package com.retailservice.retailserviceapi.repository;

import com.retailservice.retailserviceapi.model.RetailData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface RetailRepository extends JpaRepository<RetailData, String> {

    }
