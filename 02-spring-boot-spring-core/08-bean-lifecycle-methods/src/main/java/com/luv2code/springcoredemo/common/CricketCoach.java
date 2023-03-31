package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // 초기화 메서드 정의
    @PostConstruct
    public void doMyStartupStuff() {

        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    // 파괴 메서드 정의
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}

/* 빈 라이프사이클 메서드
*   단계 1: 초기화 혹은 파괴를 위한 메서드 정의
*   단계 2: @PostConstruct & @PreDestroy 에노테이션 덧붙이기
* 
* 앱을 구동하면 초기화 메서드가 실행된다
*   In constructor: BaseballCoach
In constructor: CricketCoach
In doMyStartupStuff(): CricketCoach  -> PostConstruct 되었다
In constructor: TennisCoach
In constructor: TrackCoach
In constructor: DemoController
* 
* 앱을 종료하면 파괴 메서드가 실행된다
* */