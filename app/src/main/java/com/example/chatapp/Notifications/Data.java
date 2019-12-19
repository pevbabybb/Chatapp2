package com.example.chatapp.Notifications;

public class Data {
    private String user;
    private  int icon;
    private String body;
    private String title;
    private String sented;

    public Data(String user,int icon,String body,String title,String sented){
           this.user=user;
           this.icon=icon;
           this.body=body;
           this.title=title;
           this.sented=sented;
    }
        public Data(){

}
public  String getUser(){
        return user;
}
public  void setUser(){
        this.user=user;
}
public  int getIcon(){
        return icon;
}
public void setIcon(){
        this.icon = icon;
}
public String getBody(){
        return body;
}
public void setBody(){
        this.body=body;
}

public String getTitle(){
        return sented;
}
public void setTitle(){
        this.title=title;
}
public String getSented(){
        return sented;
}
public void setSented(){
        this.sented=sented;
}
}
