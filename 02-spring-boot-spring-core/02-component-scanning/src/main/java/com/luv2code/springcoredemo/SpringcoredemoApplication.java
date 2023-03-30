package com.luv2code.springcoredemo;

// 스프링 부트는 com.luv2code.springcoredemo 패키지 안에 있는 서브패키지만 스캐닝한다
// 그 밖에 있는 패키지에 대한 스캐닝을 하고 싶으면 SpringcoredemoApplication 에서 따로 설정해줘야한다

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
	
	이런 식으로 com.luv2code.util까지 컴포넌트 스캐닝의 대상이라고 base 패키지를 명시해줘야한다
		scanBasePackages = {"com.luv2code.springcoredemo",
							"com.luv2code.util"})
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
