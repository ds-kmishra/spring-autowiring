package org.example.autowire.annotation;

import org.springframework.stereotype.Repository;

@Repository("custDao") // We can name the bean - by default it takes byType
public class CustomerDao {

}
