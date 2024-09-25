package com.ak.course.demo.service;

import com.ak.course.demo.entity.User;

import java.util.List;

public interface UserService {

    /**
     * Get all the users in db.
     * @return
     */
    List<User> getAllUsers();
}
