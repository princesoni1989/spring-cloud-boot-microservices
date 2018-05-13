package com.springcloud.prince.homeloanservice;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Response {

    private String name;
    private String surname;

    public Response(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
