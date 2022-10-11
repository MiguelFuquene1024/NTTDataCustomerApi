package com.serviceRest.CustomerInformationApi;

import com.serviceRest.CustomerInformationApi.exception.CustomerException;
import com.serviceRest.CustomerInformationApi.model.dtos.CustomerDTO;
import com.serviceRest.CustomerInformationApi.model.entities.Customer;
import com.serviceRest.CustomerInformationApi.repository.CustomerRepository;
import com.serviceRest.CustomerInformationApi.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;

@SpringBootTest
class CustomerInformationApiApplicationTests {
	@Autowired

	@Mock
	private CustomerService customerService;
	@Mock
	private CustomerRepository customerRepository;

	@Test
	public void findByDocumentTypeAndNumberDocument() throws CustomerException {
		Customer mockCustomer = new Customer(
				1,
				"C",
				1000575071,
				"Miguel",
				"Angel",
				"Fuquene",
				"Arias",
				3003775,
				"Calle 182 #10a11",
				"Chia");
		CustomerDTO customerDTO= new CustomerDTO("C",1000575071);
		Customer customer = new Customer(customerDTO);
		when(customerRepository.findByDocumentTypeAndNumberDocument("C",1000575071)).thenReturn(Optional.of(mockCustomer));
		assertNotNull(customerService.getCustomerByTypeAndNumberDocument(customer));

	}


}
