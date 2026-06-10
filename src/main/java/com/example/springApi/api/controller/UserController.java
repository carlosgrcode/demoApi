package com.example.springApi.api.controller;

import com.example.springApi.api.model.User;
import com.example.springApi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*IMPORTANTE: El controlador*/

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;      /*Crea un objeto userService que contiene la lista de usuarios y sus métodos*/

    public UserController(UserService userService) {    /*constructor al que inyectamos userService*/
        this.userService = userService;
    }

    @GetMapping                                 /*definimos el get*/
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping                                /*definimos el post*/
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
