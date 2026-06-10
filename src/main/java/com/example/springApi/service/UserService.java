package com.example.springApi.service;

import com.example.springApi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/*los metodos del usuario y un constructor con uno de prueba*/
@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers(){
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public UserService(){
        User user = new User(1,"Carlos",82);
        users.add(user);
    }

    public String getUser(int userId){
        String name = "null";
        for(User u:users){
            if(u.getId()==userId){
                name = u.getName();
            }
        }
        return name;
    }

}
