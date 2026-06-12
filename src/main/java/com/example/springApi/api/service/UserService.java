package com.example.springApi.api.service;

import com.example.springApi.api.dto.UserDTO;
import com.example.springApi.api.mapper.UserMapper;
import com.example.springApi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/*los metodos del usuario y un constructor con uno de prueba*/
@Service
public class UserService {
    private final UserMapper userMapper;

    private List<User> users = new ArrayList<>();       /*lista de usuarios User*/

    public List<UserDTO> getUsers(){
        List<UserDTO> userDTOs = new ArrayList<>();     /*la nueva lista de DTOs*/

        for(User user:users){
            userDTOs.add(userMapper.toDto(user));                /*User --> UserDTO ahora con mapstruct!!*/
        }

        return userDTOs;                                /*devuelve la nueva lista*/
    }

    public void addUser(User user){
        users.add(user);
    }

    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;                           /*en el constructor userMapper pasa como parámetro*/

        User user = new User(1,"Carlos",82);     /*usuario de ejemplo*/
        users.add(user);
    }

    public String getUserById(int userId){
        String name = "null";
        for(User u:users){
            if(u.getId()==userId){
                name = u.getName();
            }
        }
        return name;
    }

    public void removeUser(int userId) {
        users.removeIf(u -> u.getId() == userId);       /*un for pero más limpio*/
    }

}
