package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}

// 종속성 주입 방법2 - 새터 인젝션
/*
* 1. 인젝션을 위해서 클래스에 새터 메서드를 생성한다
* ex) setCoach 메서드를 생성한다
* 2. @Autowired 어노테이션을 이용하여 DI를 설정한다
* setCoach 메서드에 @Autowired 어노테이션을 이용한다
*
* DI는 스프링 프레임워크 내부적으로 이루어진다
* Coach 인터페이스 - CricketCoach(Coach의 구현체) - DemoController 
*
* 
* */

// 종속성 주입 방법3 - 필드 인젝션(레거시)
/*
*  필드 인젝션으로 DI를 할 경우에는 유닛 테스트가 힘들어져서 잘 쓰지 않는다
*  private 필드에 직접적으로 @AutoWired 어노테이션을 붙인다. 별도의 새터나 생성자는 필요없지만
*  유닛 테스트가 힘들어져서 레거시가 되었다
*
* */