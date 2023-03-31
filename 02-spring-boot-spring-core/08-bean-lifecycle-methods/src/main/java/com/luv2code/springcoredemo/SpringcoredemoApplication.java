package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

/* 	빈 라이프사이클
* 컨테이너 시작 -> 빈 초기화 -> 의존성 주입 -> 스프링 내부 프로세싱 -> 커스텀 메서드
* 
* 빈 초기화와 빈 파괴 동안 커스텀 코드를 추가할 수 있다
* @PostConstruct 
* @PreDestroy
*	에노테이션을 이용한다
*
* */