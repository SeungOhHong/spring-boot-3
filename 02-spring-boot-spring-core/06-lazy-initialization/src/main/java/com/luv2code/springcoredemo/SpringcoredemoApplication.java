package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

// 기본적으로 앱이 구동되면 모든 빈들은 초기화된다
// 스프링은 각각의 인스턴스들을 생성하고 사용가능하도록 만든다
// @Lazy 어노테이션이 붙은 클래스는 빈을 생성하지 않도록 할 수 있다
// application.properties에서 모든 빈들을 Lazy상태로 만들 수 있다
// spring.main.lazy-initialization=true

