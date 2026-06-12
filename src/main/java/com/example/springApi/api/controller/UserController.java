package com.example.springApi.api.controller;

import com.example.springApi.api.dto.UserDTO;
import com.example.springApi.api.model.User;
import com.example.springApi.api.service.UserService;
import jakarta.validation.Valid;
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
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")                        /*GetMapping por id*/
    public String getUserById(@PathVariable(value = "id") Integer id){
        return userService.getUserById(id);
    }

    @PostMapping                                /*definimos el post*/
    public void addUser(@Valid @RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable(value = "id") Integer id){
        userService.removeUser(id);
    }
}
