package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Properties;

@Configuration
public class TestConfig {

    @Autowired
    Properties properties;
    @Autowired
    private Environment enviroment;
    @Value("${server.port}")
    private String port;

    @Bean
    public void testBean() {
        System.out.println(enviroment.getProperty("server.port"));
        System.out.println(port);
        port = "9000";
        properties.setProperty("server.port", port);
        System.out.println(port);
        System.out.println(enviroment.getProperty("server.port"));

    }

    @Bean
    public void changeTheServerPort() {
        port = "8888";
        System.out.println("hi");
    }
}
