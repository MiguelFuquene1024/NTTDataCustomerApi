package com.serviceRest.CustomerInformationApi.service.impl;

import com.serviceRest.CustomerInformationApi.exception.CustomerException;
import com.serviceRest.CustomerInformationApi.model.entities.Customer;

import java.util.Optional;

public interface CustomerService {

    Optional<Customer> getCustomerByTypeAndNumberDocument(Customer customer) throws CustomerException;
}
