package com.bart.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
@RequestMapping("/bart-user")
public class DemoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PutMapping("/insert")
    public String insert(){
        String sql = "insert into users(id,username,password,email,role) values(111,'jsh','ttt','rrr','vvv')";
        jdbcTemplate.update(sql);
        return "insert Ok";
    }

}
