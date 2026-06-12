package com.example.springApi.api.model;

import jakarta.validation.constraints.NotNull;

/*la clase usuario con getters y setters y poco mas*/
public class User {
    @NotNull
    private final Integer id;
    @NotNull
    private String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
