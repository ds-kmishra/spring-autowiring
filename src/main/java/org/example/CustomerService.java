package org.example;

public class CustomerService {
    private CustomerDao customerDao;

    public CustomerService() {
        System.out.println("Calling CustomerService constructor ...");
    }

    public CustomerService(CustomerDao custDao) {
        this.customerDao = custDao;
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        System.out.println("calling setter method ...");
        this.customerDao = customerDao;
    }
}
