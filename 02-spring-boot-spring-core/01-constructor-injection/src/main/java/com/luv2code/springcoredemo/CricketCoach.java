package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;
// 1단계 디펜던시 인터페이스(Coach)와 클래스(CricketCoach) 정의하기
// CricketCoach 클래스는 Coach 인터페이스의 구현체이다
// @컴포넌트 어노테이션으로 마킹해준다. 이제 스프링 빈에서 CricketCoach를 의존성주입 대상으로 인식한다
@Component
public class CricketCoach implements Coach {
    @Override
    // getDailyWorkout 메서드는 옆의 문자열을 리턴하도록 한다
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!";
    }
}

// 여기까지가 Step1이다
