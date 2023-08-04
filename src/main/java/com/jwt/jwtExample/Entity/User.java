package com.jwt.jwtExample.Entity;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    private String emailId;
    private String userRole;

}
