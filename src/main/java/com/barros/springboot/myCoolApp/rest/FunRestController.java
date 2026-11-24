package com.barros.springboot.myCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Explose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/workout")
    public String getDailyWorkou(){
        return "<h1>Run a hard 5k</h1>";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day";
    }
}
