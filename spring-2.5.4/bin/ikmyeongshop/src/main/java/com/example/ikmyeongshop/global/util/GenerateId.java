package com.example.ikmyeongshop.global.util;


public class GenerateId {
  private int nextUserId = 1;

  public int generateById(String target) {
    if(target == "USER") return this.updateId();
    throw new Error("target did not exists");
  }

  private int updateId(){
    this.nextUserId++;
    return this.nextUserId;
  }
}


