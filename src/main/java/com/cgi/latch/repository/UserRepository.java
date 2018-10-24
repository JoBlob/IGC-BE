package com.cgi.latch.repository;

import org.springframework.dao.DataAccessException;

// TODO: implementer avec la librarie spring data:
// voir https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html

import com.cgi.latch.model.User;

public interface UserRepository {

    void save(User user) throws DataAccessException;

}
