package com.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SignupController {
  @Autowired
  private UserApplicationService userApplicationService;

  /**GetMapping */
  @GetMapping("/signup")
  public String getSignup(Model model) {
    //get Gender
    Map<String, Integer> genderMap = userApplicationService.getGenderMap();
    model.addAttribute("genderMap", genderMap);

    //transition to user sign up page
    return "/user/signup";
  }

  /**User signup process */
  @PostMapping("/signup")
  public String postSignup() {
    //Redirect to login screen
    return "/redirect/login";
  }
}
