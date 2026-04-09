package org.srikanth.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.srikanth.Alien;
import org.srikanth.Computer;
import org.srikanth.Desktop;
import org.srikanth.Laptop;

@Configuration
@ComponentScan("org.srikanth")
public class AppConfig {
//    @Bean
//    public Alien alien(Computer com){//@Qualifier
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//    @Bean
//   // @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }



    }
