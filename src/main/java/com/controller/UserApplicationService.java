package com.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {

  /**Generating a gender Map */
  public Map<String, Integer> getGenderMap() {
    Map<String, Integer> genderMap = new LinkedHashMap<>();
    genderMap.put("Male", 1);
    genderMap.put("Female", 2);
    return genderMap;
  }
}
