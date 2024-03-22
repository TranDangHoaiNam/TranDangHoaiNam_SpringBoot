/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.buoi2.Dao;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   3/22/2024
 *vesion: 1.0
 */

import org.example.buoi2.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

import java.util.List;

@Configuration
public class User_Dao {
    @Bean
    public List<User> userList(){
        List<User> users = new ArrayList<>();

        // Thêm các đối tượng User vào danh sách
        users.add(new User("1L", "user1"));
        users.add(new User("2L", "user2"));
        users.add(new User("3L", "user3"));
        users.add(new User("4L", "user4"));
        users.add(new User("5L", "user5"));
        users.add(new User("6L", "user6"));
        users.add(new User("7L", "user7"));
        users.add(new User("8L", "user8"));
        users.add(new User("9L", "user9"));
        users.add(new User("10L", "user10"));



        return users;
    }
}



