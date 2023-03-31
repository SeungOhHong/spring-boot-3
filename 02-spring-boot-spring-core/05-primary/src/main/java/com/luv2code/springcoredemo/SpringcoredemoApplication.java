package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

// @Primary 어노테이션 활용
/*
* 여러개의 구현체가 있을 때 @Qualifier 어노테이션 말고 다른 대안도 있다
* @Primary 어노테이션은 하나의 클래스에만 사용할 수 있다. 여러개에 붙일 경우 에러가 발생한다
* 동시에 사용할 경우 @Qualifier 가 우선 순위를 갖는다
*
* */