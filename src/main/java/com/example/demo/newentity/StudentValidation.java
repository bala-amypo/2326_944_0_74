package com.example.demo.newentity;
import jakarta.persistence.Id;
public class studentValidation{
    @Idprivate Long id;
    @NotBlank
    private String name;
    private String email;
}