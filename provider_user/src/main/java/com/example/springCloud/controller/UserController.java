package com.example.springCloud.controller;

import com.example.springCloud.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;
    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }

    /*响应服务的地址*/
    @RequestMapping("/info")
    public String info(){
        InstanceInfo instanceInfo =
                eurekaClient.getNextServerFromEureka("provider-user",false);
        return instanceInfo.getHomePageUrl();
    }



}
