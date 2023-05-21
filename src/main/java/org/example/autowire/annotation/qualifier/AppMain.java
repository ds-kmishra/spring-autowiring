package org.example.autowire.annotation.qualifier;

import org.example.autowire.annotation.qualifier.AppConfig;
import org.example.autowire.annotation.qualifier.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        System.out.println(customerService.getCustomerDao());

    }
}
