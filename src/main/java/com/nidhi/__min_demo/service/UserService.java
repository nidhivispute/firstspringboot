package com.nidhi.__min_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nidhi.__min_demo.domain.User;
import com.nidhi.__min_demo.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save (User user){
        userRepository.save(user);

    }

    public List<User> findALL() {
       return userRepository.findAll();
    }
}
