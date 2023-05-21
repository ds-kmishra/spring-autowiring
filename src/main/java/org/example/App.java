package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-web.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService.getCustomerDao());
    }
}
