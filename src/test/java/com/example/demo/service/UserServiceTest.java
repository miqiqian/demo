package com.example.demo.service;

import com.example.demo.DemoApplicationTests;
import com.example.demo.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest extends DemoApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void listAllUser() {
        List<User> list = userService.listAllUser();
        Assertions.assertNotNull(list);

    }

    @Test
    void getUser() {
        User user = new User();
        user.setName("aa");
        user.setMobile("15455454");
        user.setEmail("123@163.com");
        userService.createUser(user);
    }

    @Test
    void createUser() {
    }

    @Test
    void deleteUser() {
    }
}