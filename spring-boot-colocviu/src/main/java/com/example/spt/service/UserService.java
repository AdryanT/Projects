package com.example.spt.service;

import com.example.spt.entity.User;
import com.example.spt.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(x -> users.add(x));
        return users;
    }

    public User getUser (Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(long id){
    	userRepository.deleteById(id);
    }

}
