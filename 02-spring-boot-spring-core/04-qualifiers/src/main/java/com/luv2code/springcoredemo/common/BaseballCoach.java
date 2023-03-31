package com.luv2code.springcoredemo.common;

// 여러개의 새로운 클래스를 생성해준다
// 이제 Coach 라는 인터페이스에 대한 4개의 다른 구현체(클래스)를 생성하였다
import org.springframework.stereotype.Component;

// 컴포넌트 어노테이션으로 DI 대상으로 인식하도록 해준다
@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
