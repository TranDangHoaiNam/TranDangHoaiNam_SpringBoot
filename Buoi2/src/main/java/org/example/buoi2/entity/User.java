/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package org.example.buoi2.entity;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   3/22/2024
 *vesion: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
public class User {

    private String id
            ;
    private String name
            ;
}



