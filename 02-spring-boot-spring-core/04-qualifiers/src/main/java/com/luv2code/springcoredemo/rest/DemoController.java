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

    // @Qualifier 어노테이션 없이 어플을 구동시키면 어떤 클래스를 구현할 지 특정하지 않아서 에러가 뜬다
    // 그래서 컨트롤러에서 @Qualifier() 어노테이션을 이용하여 빈아이디를 특정해준다 ("cricketCoach")
    // 여러 클래스들 중에 종속성 주입 대상을 특정해주는 것이다
    // @Qualifier() 안의 빈아이디를 변경하면 반환하는 문자열이 바뀐다
    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}






