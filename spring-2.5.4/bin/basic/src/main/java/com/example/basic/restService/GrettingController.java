package com.example.basic.restService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {
  private static final String template = "Hello %s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/gretting", method = RequestMethod.GET)
  public Gretting gretting(@RequestParam(value = "name", defaultValue = "world") String name) {
    return new Gretting(counter.incrementAndGet(), String.format(template, name));
  }
}
