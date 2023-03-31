package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    // 새로운 필드를 생성한다
    private Coach anotherCoach;

    @Autowired
    public DemoController(
                @Qualifier("cricketCoach") Coach theCoach,
                // anotherCoach를 주입하기 위한 생성자를 업데이트한다
                // 모든 인젝션이 같은 빈을 참조할 것이다.
                @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
    // 메모리 정보를 체크하기 위한 코드
    @GetMapping("/check")
    // 싱글톤일 경우 결과로 true를 리턴할 것이다
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}






