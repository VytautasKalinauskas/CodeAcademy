package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class SignupDto {

    @Email
    @NotBlank
    @Size(max = 50)
    private String email;

    @Size(min = 6, max = 20)
    @NotBlank
    private String password;

    @Size(min = 6, max = 20)
    @NotBlank
    private String repeatPassword;

}
