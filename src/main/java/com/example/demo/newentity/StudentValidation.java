package com.example.demo.newentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


public class studentValidation{
    @Id
    @GeneratedValue(stratergy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="no spaces")
    private String name;
    @NotBlank(message="no  spaces")
    @Email(message="Invalid")
    private String email;

    public class StudentValidation()import jakarta.validation.constraints.NotBlack;
{
    
}
}