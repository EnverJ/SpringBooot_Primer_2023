package com.example.spring_1.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {

  @GetMapping("/hello")
  public String getHello() {
    // screen transition to hello.html
    return "hello";
  }

  @PostMapping("/hello")
  public String postRequest(@RequestParam("text1") String str, Model model) {
    // Register the String received from the screen to Model
    model.addAttribute("sample", str);
    return "/hello/response";
  }
}
