package org.example.autowire.annotation;

import org.example.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    //@Autowired // Not recommended as their can be cyclic problem
    private CustomerDao customerDao;

    // No need to add Autowire - by default Spring declares it automatically - since spring 4.3
    // By default Spring call the constructor to have the dependency
    // If we have default constructor - non-parameterized constructor then we might get null values
    // Thus we add @Autowire annotation

    public CustomerService(){

    }
    @Autowired
    public CustomerService(CustomerDao customerDao){
        this.customerDao = customerDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    //@Autowired // Not recommended cause it breaks the encapsulation as the setter is not private
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
