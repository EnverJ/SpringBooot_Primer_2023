package com.example.spring_1.hello;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public Map<String, Object> findById(String id) {
    // Select statement
    String query = "SELECT*" + " FROM employee" + " WHERE id=?";

    // Search execution
    Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
    return employee;
  }
}
