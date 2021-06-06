package com.demoproject.demoaopapi.sercurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CurrentUserHolder {

    private static String username;

    public static  String get(){
        return username;
    }

    public static void set(String name){
        username=name;
    }
}
