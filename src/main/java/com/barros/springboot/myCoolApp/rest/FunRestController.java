package com.barros.springboot.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Inject Properties for: coach.name and team.name

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    //Expose new EndPoint for "teamInfo"

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }

    //Expose "/" that return "Hello World"

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
