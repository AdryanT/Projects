package com.example.spt.controller;

import org.springframework.web.bind.annotation.*;

import com.example.spt.entity.User;
import com.example.spt.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser (@PathVariable("id") long id){
        return userService.getUser(id);
    }

    @PostMapping
    public User saveUser (@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") long id){
    	userService.deleteUser(id);
    }
}
