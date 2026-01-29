package com.gla.day2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamasteWorld {
    @GetMapping("/")
    public String hello(){
//        System.out.println("Namaste WOrls - 1");
        return "Namaste Duniya wasiyo";
    }
}

@RestController
class SatsriakalWorld {
    @GetMapping("/sam")
    public String hello(){
        System.out.println("Namaste WOrls - 2");
        return "Satsriakal Duniya wasiyo";
    }
}
