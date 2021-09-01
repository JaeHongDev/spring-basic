package com.example.ikmyeongshop.domain.user;

import java.util.List;

import com.example.ikmyeongshop.global.util.GenerateId;

public class UserRepository {
  private  List<User> users;

  public void add(User user){
    int id = new GenerateId().generateById("USER");
    user.setid(id);
    
    users.add(user);
  }


  public List<User> all(){
    return this.users;
  }

}
