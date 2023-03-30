package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // application.properties에서 정의한 커스텀으로 만든 프로퍼티 주입하기: coach.name and team.name
    // @Value("${정의한 프로퍼티명}")
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // teaminfo 엔드포인트에서 프로퍼티 사용하기

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

}






