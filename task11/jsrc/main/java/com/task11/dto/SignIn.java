package com.task11.dto;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SignIn {
    private String email;
    private String password;

}