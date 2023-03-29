package com.example.demo.controller;

import com.example.demo.model.entity.Customer;
import com.example.demo.model.request.NewCustomerRequest;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

//    @Autowired
//    private HttpHeaders httpHeaders;

    @Autowired
    private CustomerService customerService;


    @GetMapping("/")
    public ResponseEntity<List<Customer>> getCustomer(
            @RequestHeader HttpHeaders header,
            @RequestHeader(value = "accept_language", required = false) String language
    ) {

        List<Customer> response = customerService.getCustomer(header);

//        httpHeaders.add("asdd", "asdf");
//		return ResponseEntity.status(HttpStatus.OK)
//                .header(String.valueOf(httpHeaders))
//                .body(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    //    record NewCustomerRequest(
//            String name,
//            String email,
//            Integer age
//    ) {}
    @PostMapping("/")
    public ResponseEntity<Integer> addCustomer(
            @RequestHeader HttpHeaders header,
            @RequestHeader(value = "accept_language", required = false) String language,
            @RequestBody NewCustomerRequest request
    ) {
        Integer response = customerService.addCustomer(header, request);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
