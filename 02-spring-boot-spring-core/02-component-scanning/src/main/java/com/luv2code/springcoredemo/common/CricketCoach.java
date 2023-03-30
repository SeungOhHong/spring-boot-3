package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}

// # 컴포넌트 스캐닝
// 스프링은 특수한 어노테이션이 붙은 자바 클래스들을 스캔한다 ex) @Component 어노테이션
// 그리고 스프링 컨테이너에 빈들을 자동 등록한다

// rest와 common 두가지의 패키지를 생성한다
// 이제 이 두 패키지는 com.luv2code.springcoredemo 라는 메인 패키지의 서브 패키지가 된다
// Coach와 CricketCoach는 common 패키지에 / DemoController는 rest 패키지에 옮긴다

