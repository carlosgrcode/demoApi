package com.example.springApi.api.dto;

public class UserDTO {
    private String name;

    public UserDTO(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
