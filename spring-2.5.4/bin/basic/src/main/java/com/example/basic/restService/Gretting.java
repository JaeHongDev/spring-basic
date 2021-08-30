package com.example.basic.restService;

public class Gretting {

  private final long id;
  private final String content;

  public Gretting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return this.id;
  }

  public String getContent() {
    return this.content;
  }

}