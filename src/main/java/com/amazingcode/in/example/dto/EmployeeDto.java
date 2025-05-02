package com.amazingcode.in.example.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String email;
}
