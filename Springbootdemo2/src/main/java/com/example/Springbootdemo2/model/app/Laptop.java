package com.example.Springbootdemo2.model.app;

import org.springframework.stereotype.Component;

@Component

public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling in laptop");
    }
}
