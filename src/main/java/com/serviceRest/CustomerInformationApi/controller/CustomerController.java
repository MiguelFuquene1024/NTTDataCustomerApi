package com.serviceRest.CustomerInformationApi.controller;

import com.serviceRest.CustomerInformationApi.exception.CustomerException;
import com.serviceRest.CustomerInformationApi.model.entities.Customer;
import com.serviceRest.CustomerInformationApi.service.CustomerServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CustomerController {

    @Autowired
    private CustomerServiceRest customerService;

    @PostMapping
    private ResponseEntity<Optional<Customer>> getCustomerInfo(@RequestBody Customer customer) throws CustomerException{
        try{
            return new ResponseEntity<>(customerService.getCustomerByTypeAndNumberDocument(customer), HttpStatus.OK);
        }catch (CustomerException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
