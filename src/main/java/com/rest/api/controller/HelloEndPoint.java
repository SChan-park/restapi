package com.rest.api.controller;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.data.convert.WritingConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
/////test/////
@Component
public class HelloEndPoint {
    @RequestMapping
    @ReadOperation
    public String hello(String name){
        return "hello" + name;
    }
    @WriteOperation
    public String foo(String name) {
        return name;
    }
}
