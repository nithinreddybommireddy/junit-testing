package com.stschool.ecommerce.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Customer {
    private int id;
    private String name;
    private String email;
    private double balance;


}
