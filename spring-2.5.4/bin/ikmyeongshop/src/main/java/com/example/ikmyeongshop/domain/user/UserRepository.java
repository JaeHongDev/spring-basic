package com.example.ikmyeongshop.domain.user;

import java.util.List;

import com.example.ikmyeongshop.global.util.GenerateId;

public class UserRepository {
  private  List<User> users = new List<User>();

  public void add(String name, String email){
    //get generated id
    int id = new GenerateId().generateById("USER");
    
    
    //users.add(user);
  }


  public List<User> all(){
    return this.users;
  }

}


/*abstract

import java.util.*;

 class User{
    int id;
    String name; 
    String email;
    
    User(int id,String name,String email){
        this.id = id; 
        this.name = name;
        this.email = email;
    }
}


 class UserRepository{ 
    
    public static ArrayList<User> users = new ArrayList<User>();
    
    public List<User> all(){
        return users;
    }
    
    public void add(int id, String email, String name){
        this.users.add(
            new User(id,email,name)
        );
    }
} 

 class Generate{
    
    private static int nextUserId =  1;
    
    
    public int getNextId(String type){
        if(type == "USER") {
            this.nextUserId++;
            return this.nextUserId;
        };
        
        
        //new throw Error("type did not exists");
        return 0;
        
    }
    
}

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        String email = "aaa@aa";
        String name = "bb";
        
        int id = new Generate().getNextId("USER");
        
        UserRepository userRepository = new UserRepository();
        userRepository.add(id,email,name);
        
        userRepository.all().forEach((user)-> System.out.println(user.id));
        

     }
     
}

*//