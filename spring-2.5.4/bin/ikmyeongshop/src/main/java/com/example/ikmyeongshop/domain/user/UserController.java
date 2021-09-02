package com.example.ikmyeongshop.domain.user;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  private static final Logger log = LoggerFactory.getLogger(UserController.class);
  @GetMapping("/user")
  public String user(){ 
  
    return "hello user";
  }


  @GetMapping("/user/{id}")
  public void userMyProfile(@PathVariable("id") String userId){ 
    log.info(userId);
  }


  @PostMapping("/user/create")
  public List<User> userCreateRouter(@RequestParam Map<String,String> params){

    //String name = params.get("name");
    //String email = params.get("email");


    String name = "aaa";
    String email = "bbb";
    
    UserRepository userRepository = new UserRepository();
    userRepository.add(name,email);
    
    return userRepository.all();
  }
}


@PostMapping("/auth/login")
public User userLoginRouter(@RequestParam map<String, String> params) {
  String email = "bbb";

  
}