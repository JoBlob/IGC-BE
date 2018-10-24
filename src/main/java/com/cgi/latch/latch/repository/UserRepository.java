package com.cgi.latch.latch.repository;

import com.cgi.latch.latch.model.User;
import org.springframework.dao.DataAccessException;

public interface UserRepository {

    void save(User user) throws DataAccessException;

}
