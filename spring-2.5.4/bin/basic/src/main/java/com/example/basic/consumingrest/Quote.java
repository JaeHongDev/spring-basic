package com.example.basic.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

  private String type;
  private Value value;

  public Quote() {
  }

  private String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  private Value getValue() {
    return this.value;
  }

  public void setValue(Value value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Quote{" + "type='" + type + '\'' + ", value=" + value + '}';
  }
}