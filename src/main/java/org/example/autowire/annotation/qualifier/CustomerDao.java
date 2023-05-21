package org.example.autowire.annotation.qualifier;

import org.springframework.stereotype.Repository;


public interface CustomerDao {
/*
Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qu
alifying bean of type 'org.example.autowire.annotation.qualifier.CustomerDao' available:
expected single matching bean but found 2: customerDaoImpl1,customerDaoImpl2
 */
    // If we have two implementations of the interface

    // We can solve this issue by -
    // 1. Add -> @Autowired(required="false")
    // 2. Add @Repository to only required Implementation
    // 3. @Qualifier
}
