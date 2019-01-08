package com.example.springCloud.controller;

import com.example.springCloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Consumer {
    @Autowired
    private RestTemplate restTemplate;//spring 提供的访问rest接口的模板对象
    public String url = "http://localhost:7900/user/";
    @RequestMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        //访问提供者获取数据
        User user = restTemplate.getForObject(url + id, User.class);
        return user;
    }
}
