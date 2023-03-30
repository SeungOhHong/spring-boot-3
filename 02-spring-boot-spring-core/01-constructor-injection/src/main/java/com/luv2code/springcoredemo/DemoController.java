package com.luv2code.springcoredemo;
// 2단계 : REST 컨트롤러 생성
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 어노테이션을 추가해준다
@RestController
public class DemoController {
    // 디펜던시를 위한 프라이빗 필드 정의
    private Coach myCoach;

    // DI를 위한 생성자를 정의해준다
    // Autowired 어노테이션은 스프링에게 의존성을 주입하라고 명령한다
    @Autowired
    // DemoController 생성자
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    // 4단계 dailyworkout 엔드포인트에 Get맵핑해주기
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

// 웹브라우저가 /dailyworkout 를 호출하면 -> DemoController 가 Coach 에게 getDailyWorkout 메서드를 호출한다
// 그러면 문자열을 반환하고 브라우저에게 돌아간다
// 이제 http://localhost:8080/dailyworkout 에 엑세스하면 문자열을 리턴한다





