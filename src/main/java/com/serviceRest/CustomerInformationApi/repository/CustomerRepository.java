package com.serviceRest.CustomerInformationApi.repository;

import com.serviceRest.CustomerInformationApi.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByDocumentTypeAndNumberDocument(String documentType, int numberDocument);
}
