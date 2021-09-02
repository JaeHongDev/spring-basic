package com.example.ikmyeongshop.domain.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.ikmyeongshop.global.util.Generate;

public class UserRepository {
  private static final List<User> users = new ArrayList<User>();

  public void add(String name, String email){
    //get generated id
    int id = new Generate().getNextId("USER");
    User user = new User();
    user.setid(id);
    user.setname(name);
    user.setemail(email);

    users.add(user);

    System.out.println("Success user create");
  }


  public User findByEmail(String email){ 
    return users.stream().filter(user->user.getemail() == email ).collect(Collectors.toList());

  }

  public List<User> all(){
    return users;
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

*/