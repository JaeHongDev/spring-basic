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

    
    UserRepository userRepository = new UserRepository();
    userRepository.add(user);

    return userRepository.all();
  }
}

/*
  RequestParam의 값을 타입에 맞게 집어 넣을 수 없을까? 
  ex) @RequestParam UserCreateInterface userCreate
  
  만약 값이 1대1 대응이 안되면 오류가 발생하도록
  publc interface UserCreateInterface{
    int id
    String name
    String email
  }

  requestParamValue{
    id:1
    errorKey:11 // confirm error : request key errorKey did not correct by UserCreateInterface 
  } // confirm error: request key did not exists


*/


//https://cheese10yun.github.io/spring-guide-directory/
//폴더 구조 참고하기