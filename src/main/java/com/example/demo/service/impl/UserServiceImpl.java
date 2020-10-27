package com.example.demo.service.impl;

import com.example.demo.mapper.UserRepository;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * UserService实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userMapper;

    @Override
    public List<User> listAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = userMapper.findById(id);
        return user.get();
    }

    @Override
    public void createUser(User user) {
         userMapper.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteById(id);

    }

}
