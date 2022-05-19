package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
public class Controller {

  @GetMapping("/user/{user}")
  @ResponseBody
  public String getUser(@PathVariable("user") String user) {
    return "Hola:  " + user;
  }

  @RequestMapping(value = "/useradd", method = RequestMethod.POST, consumes = "application/json")
  public User postUserAdd (@RequestBody User user){
    return user;
  };


  // Using java.util.Optional
  /*
  @GetMapping(value = {"/user/", "/user/{username}"})
  @ResponseBody
  public String getUserOptional(@PathVariable("username") Optional<String> userName) {
    if (userName.isPresent()) {
      return "The username is:  " + userName.get();
    } else {
      return "username invalid";
    }
  }

   */
}
