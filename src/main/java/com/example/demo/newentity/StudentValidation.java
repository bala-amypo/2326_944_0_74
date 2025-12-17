package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlack;

public class studentValidation{
    @Id
    private Long id;

    @NotBlank(message="no spaces")
    private String name;
    @NotBlank(message="no  spaces")
    @Email(message="Invalid")
    private String email;
}