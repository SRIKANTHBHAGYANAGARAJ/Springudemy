package com.example.Springbootdemo2.repo;

import com.example.Springbootdemo2.model.app.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void  save(Laptop lap){
        System.out.println("saved in database");
    }
}
