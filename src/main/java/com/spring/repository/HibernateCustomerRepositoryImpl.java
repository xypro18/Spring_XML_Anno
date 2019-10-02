/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.repository;

import com.spring.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User01
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        
        Customer customer = new Customer();
        customer.setFirstname("José");
        customer.setLastname("Oliveira");
        
        customers.add(customer);
        
        return customers;        
    }
    
}
