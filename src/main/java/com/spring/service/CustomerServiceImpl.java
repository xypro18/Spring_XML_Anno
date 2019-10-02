/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User01
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    
    //@Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection");
        this.customerRepository = customerRepository;
    }

    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
