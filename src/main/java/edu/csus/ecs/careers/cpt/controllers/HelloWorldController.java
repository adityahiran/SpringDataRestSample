package edu.csus.ecs.careers.cpt.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

@Controller
public class HelloWorldController {

  @RequestMapping("/hello")
  public @ResponseBody String printHelloWorld() {
    return "Hello World - to Spring Boot and Gradle";
  }

}
