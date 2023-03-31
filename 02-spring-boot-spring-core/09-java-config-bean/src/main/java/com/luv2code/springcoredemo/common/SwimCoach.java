package com.luv2code.springcoredemo.common;

// 새로운 SwimCoach 클래스를 생성한다
public class SwimCoach implements Coach {
    // SwimCoach 에 컴포넌트 에노테이션이 없기 때문에 이대로 실행하면 오류가 뜬다
    // 때문에 config 패키지를 생성한 후 SportConfig 클래스를 생성해준다
    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
