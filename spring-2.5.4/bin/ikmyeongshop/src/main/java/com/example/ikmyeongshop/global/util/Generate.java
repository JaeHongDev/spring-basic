package com.example.ikmyeongshop.global.util;

public class Generate{
    
  private static int nextUserId =  1;
  
  
  public int getNextId(String type){

    if(type == "USER") {
        Generate.nextUserId++;
        return Generate.nextUserId;
    };
      //new throw Error("type did not exists");
      return 0;
  }
}