/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package com.example.demo.controller;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   3/20/2024
 *vesion: 1.0
 */

import com.example.demo.request.user;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Test
{
    @GetMapping("/")
    public  String hello(){
        return "hello";
    }
    @PostMapping("/user")
    public String helloUser (@RequestBody user body){
        System.out.println(body.getAge());
        return body.getName();
    }
}



