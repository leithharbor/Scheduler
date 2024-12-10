package com.spring.basic.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entity {
    private Long id;
    private String todo;
    private String name;
    private String pw;
    private String createDate;
    private String updateDate;
}
