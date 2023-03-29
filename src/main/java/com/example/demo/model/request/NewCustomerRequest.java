package com.example.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class NewCustomerRequest {
    private String name;
    private String email;
    private Integer age;
}