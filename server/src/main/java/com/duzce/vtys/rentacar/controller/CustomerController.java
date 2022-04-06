package com.duzce.vtys.rentacar.controller;

import com.duzce.vtys.rentacar.dto.CustomerDto;
import com.duzce.vtys.rentacar.model.Customer;
import com.duzce.vtys.rentacar.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getAllCustomer() throws Exception {
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

}
