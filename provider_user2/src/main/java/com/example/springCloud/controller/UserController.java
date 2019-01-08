package com.example.springCloud.controller;

import com.example.springCloud.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }


}
