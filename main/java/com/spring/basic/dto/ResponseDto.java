package com.spring.basic.dto;

import com.spring.basic.domain.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto {
    private Long id;
    private String todo;
    private String name;
    private String createDate;
    private String updateDate;

}
