package com.example.demolhlogger.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {

    private Integer userId;

    private String username;

    private String password;


}
