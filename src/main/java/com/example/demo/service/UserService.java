package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;

/**
 * UserService
 */
public interface UserService {

    List<User> listAllUser();

    User getUser(Long id);

    void createUser(User user);

    void deleteUser(Long id);

}
