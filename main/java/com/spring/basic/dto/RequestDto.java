package com.spring.basic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {
    private String todo;
    private String name;
    private String pw;
    private String createDate;
    private String updateDate;
}
