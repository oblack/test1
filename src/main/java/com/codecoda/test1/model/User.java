package com.codecoda.test1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

@NoArgsConstructor
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private int age;
}
