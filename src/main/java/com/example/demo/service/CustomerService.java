package com.example.demo.service;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.request.NewCustomerRequest;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomer(HttpHeaders headers) {
        return customerRepository.findAll();
    }

    public Integer addCustomer(
            HttpHeaders header,
            NewCustomerRequest request
    ) {
        Customer customer = new Customer()
                .setName(request.getName())
                .setEmail(request.getEmail())
                .setAge(request.getAge());
        customerRepository.save(customer);
        return 0;
    }
}
