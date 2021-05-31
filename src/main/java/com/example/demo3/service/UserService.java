package com.example.demo3.service;

import com.example.demo3.entity.User;
import com.example.demo3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User getNameByUserName(String userName) {
        return userRepository.findByUserName(userName);

    }

    public void updateUser(User user) {
    }

    public void removeUser(long id) {
    }
}
