/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.buoi2.controller;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   3/22/2024
 *vesion: 1.0
 */

import org.example.buoi2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller

@RestController
public class User_Con
{
    private final List<User> userList;

    public User_Con(List<User> userList){
        this.userList = userList;
    }
    @GetMapping("/user")
    public List<User> getUsers() {

        return userList;
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        Optional<User> userOptional = userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();

        return userOptional.orElse(null);
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User updatedUser) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                // Cập nhật thông tin người dùng
                user.setName(updatedUser.getName());

                return user;
            }
        }
        return null;
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        userList.add(user);
        return user;
    }
    @DeleteMapping("/{id}")
    public List<User> deleteUser(@PathVariable String id) {
        // Xóa người dùng với id tương ứng
        userList.removeIf(user -> user.getId().equals(id));
        return userList;
    }

}



