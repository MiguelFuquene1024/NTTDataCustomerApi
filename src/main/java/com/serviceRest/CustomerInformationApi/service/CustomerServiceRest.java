package com.serviceRest.CustomerInformationApi.service;

import com.serviceRest.CustomerInformationApi.exception.CustomerException;
import com.serviceRest.CustomerInformationApi.model.entities.Customer;
import com.serviceRest.CustomerInformationApi.repository.CustomerRepository;
import com.serviceRest.CustomerInformationApi.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceRest implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> getCustomerByTypeAndNumberDocument(Customer customer) throws CustomerException {
        Optional<Customer> customerResponse = customerRepository.findByDocumentTypeAndNumberDocument(customer.getDocumentType(), customer.getNumberDocument());
        if (customerResponse.isPresent()){
            return customerResponse;
        }
        throw new CustomerException("Error al consultar este cliente");
    }
}
