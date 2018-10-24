package com.cgi.latch.repository;

import com.cgi.latch.model.User;
import org.springframework.data.repository.CrudRepository;

//TODO: implementer avec la librarie spring data:
//voir https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html

public interface UserRepository extends CrudRepository<User, Integer> { }


