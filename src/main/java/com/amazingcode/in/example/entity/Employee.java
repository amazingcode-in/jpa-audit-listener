package com.amazingcode.in.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "employees")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
}