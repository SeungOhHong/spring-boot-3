package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // 이제 "workout" 이라는 엔드포인트를 추가해보자. 앱을 자동으로 재실행시켜준다

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "오늘 5키로나 걸었다";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "운이 좋은 날이군!";
    }

}






