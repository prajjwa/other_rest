package com.jwt.jwtExample.model.users;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String id;

    private String name;

    private String email;
}