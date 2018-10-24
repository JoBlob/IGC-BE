package com.cgi.latch.repository;

import org.springframework.dao.DataAccessException;

import com.cgi.latch.model.User;

public interface UserRepository {

    void save(User user) throws DataAccessException;

}
