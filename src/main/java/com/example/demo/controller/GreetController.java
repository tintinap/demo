package com.example.demo.controller;


import com.example.demo.model.response.GreetResponse;
import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/v1/greet")
public class GreetController {
    @GetMapping("/greet")
	public GreetResponse greet() {
		return new GreetResponse(
                "Hello",
                List.of("Java", "Python", "JS"),
                new Person("Alex", 28, 30_000)
        );
	}

//	record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ) { }

}
