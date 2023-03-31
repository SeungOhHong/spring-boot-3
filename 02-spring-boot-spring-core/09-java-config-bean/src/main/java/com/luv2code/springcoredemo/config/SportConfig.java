package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration 어노테이션을 이용한다
@Configuration
public class SportConfig {
    // 빈 환경설정을 위한 @Bean 메서드를 정의한다
    // 괄호 안에 커스텀 bean id 를 설정할 수도 있다
    // DemoController 에서 빈 id 를 aquatic 으로 바꿔준다
    @Bean("aquatic")
    // 빈 아이디는 메서드 이름과 동일하게 swimCoach
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
