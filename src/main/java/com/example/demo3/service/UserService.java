package com.example.demo3.service;

import com.example.demo3.entity.User;
import com.example.demo3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //comment
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user)
    {
        //test
                userRepository.save(user);
    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }

    public User getNameByUserName(String userName)
    {
        return userRepository.findByUserName(userName);
    }
    public User getUserById(long id)
    {
        return userRepository.findById(id).orElseThrow();
    }

    public void updateUser(User user)
    {

    }


/*
    public void removeUser(long id) {
    }

 */
//delete function
    public void deleteUser(long id)
    {
        userRepository.deleteById(id);
    }
}
