package com.sprinfgDemo.rest.webServices.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoServices service;

    @GetMapping(path = "/users")
    public List<User> getAllUsers(){
        return service.findall();
    }

    @GetMapping(path = "/user/{id}")
    public User getUser(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping(path = "/user")
    public void createUser(@RequestBody User user){

        User savedUser = service.save(user);

    }
}
