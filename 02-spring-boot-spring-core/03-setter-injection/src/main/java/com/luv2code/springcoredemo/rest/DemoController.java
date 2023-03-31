package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    // 이전 생성자 주입 코드를 지워준다
    
    // define a private field for the dependency
    private Coach myCoach;

    // 새터 메서드를 어노테이션과 함께 생성해준다
    // @Autowired 어노테이션이 붙어있기 때문에 메서드의 이름을 바꿔도 DI의 대상으로 인식된다
    // ex) setCoach -> doSomeStuff
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}






