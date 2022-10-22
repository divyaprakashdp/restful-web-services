package com.sprinfgDemo.rest.webServices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoServices {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static{
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findall(){
        return users;
    }

    public User findOne(int id){
        for(User user: users){
            if(user.getId()==id){
                return users.get(id-1);
            }
        }
        return null;
    }

    public User save(User newUser){
        if(newUser.getId()==null){
            newUser.setId(++usersCount);
        }
        users.add(newUser);
        return newUser;
    }

}
