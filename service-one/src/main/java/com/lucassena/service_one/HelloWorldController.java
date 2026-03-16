package com.lucassena.service_one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @Value("${message:Hello, default message!}")
  private String message;

  @GetMapping("/message")
  public String getMessage() {
    return this.message;
  }
}
