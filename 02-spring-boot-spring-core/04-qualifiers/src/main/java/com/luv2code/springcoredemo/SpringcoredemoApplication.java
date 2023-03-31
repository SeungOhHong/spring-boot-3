package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

// @Qualifier() 어노테이션
/*
* 하나의 Coach 인터페이스에 대한 여러개의 구현체가 있을 때 스프링은 어떤 것을 구현할까?
*	@Qualifier 어노테이션을 이용해서 특정해줄 수 있다 
*	 @Qualifier("bean 아이디") 로 특정해준다
*	빈 아이디는 클래스명과 동일하되 첫 문자열을 소문자로 써준다
* */