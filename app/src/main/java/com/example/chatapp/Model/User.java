package com.example.chatapp.Model;

public class User {

    private String id;
    private String username;
    private String image_URL;
    private String status;
    private String search;

    public User(String id , String username,String image_URL,String status,String search) {
        this.id = id;
        this.username = username;
        this.image_URL = image_URL;
        this.status = status;
        this.search = search;

    }

    public User() {
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public String getStatus(){
        return status;
    }
    public  void setStatus(String status){
        this.status= status; }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
