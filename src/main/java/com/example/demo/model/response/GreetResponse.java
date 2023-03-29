package com.example.demo.model.response;

import com.example.demo.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class GreetResponse {
    private String greet;
    private List<String> favProgrammingLanguages;
    private Person person;
}
