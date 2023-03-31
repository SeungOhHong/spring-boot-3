package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

/* 자바 환경설정 빈
*	1. @Configuration 클래스 생성하기
*	2. 빈 환경설정을 위한 @Bean 메서드 정의하기 
*	3. 컨트롤러에 빈 주입하기
*
* */
