package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController()
public class Controller {
  /*
  @GetMapping("/user/{username}")
  @ResponseBody
  public String getUser(@PathVariable("username") String userName) {
    return "The user is:  " + userName;
  }
  */

  // multiple Path variables in a single Requests
  @GetMapping("/user/{username}/{id}")
  @ResponseBody
  public String getUserAndId(
      @PathVariable("username") String userName, @PathVariable("id") String id) {
    return "The username is:  " + userName + " and ID is: " + id;
  }

  // Using java.util.Optional
  @GetMapping(value = {"/user/", "/user/{username}"})
  @ResponseBody
  public String getUserOptional(@PathVariable("username") Optional<String> userName) {
    if (userName.isPresent()) {
      return "The username is:  " + userName.get();
    } else {
      return "username invalid";
    }
  }

  @GetMapping("/about")
  public String getAbout() {
    return "About";
  }
}
