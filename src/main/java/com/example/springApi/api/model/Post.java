package com.example.springApi.api.model;

public class Post {
    private int id;
    private int userid;
    private String title;
    private String content;

    public Post(int id,int userid, String title, String content) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.content = content;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

}
