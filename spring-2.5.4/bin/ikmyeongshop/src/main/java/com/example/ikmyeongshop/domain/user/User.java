package com.example.ikmyeongshop.domain.user;

public class User {
  
  private int id;
  private String name; 
  private String email;
  private String password;

  public void setid(int id){
    this.id = id;
  } 
  public void setname(String name){
    this.name = name;
  }
  public void setemail(String email){
    this.email = email;
  }
  public void setpassword(String password){
    this.password = password;
  } 

  public int getid(){
    return this.id;
  }

  public String getname(){
    return this.name;
  }

  public String getemail(){
    return this.email;
  }

  public String getpassword(){
    return this.password;
  }

  @Override
  public String toString(){
    return "User{ id:" + this.id + "\nname: "+ this.name + "\n ";
  }

  // id
  // name
  // email
  // password
  
}
