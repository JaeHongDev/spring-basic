package com.example.ikmyeongshop.domain.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
  
  @GetMapping("/user")


  public String user(){
    return "hello user";
  }
}


//https://cheese10yun.github.io/spring-guide-directory/
//폴더 구조 참고하기