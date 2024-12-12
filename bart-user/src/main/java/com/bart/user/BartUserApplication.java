package com.bart.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BartUserApplication
{
    public static void main(String[] args) {
        SpringApplication.run(BartUserApplication.class, args);
    }
}
