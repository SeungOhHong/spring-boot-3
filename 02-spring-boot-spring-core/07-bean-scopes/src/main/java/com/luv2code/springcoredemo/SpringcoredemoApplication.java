package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

// 기본적으로 스코프는 싱글톤이다
// 프로토타입 스코프는 각각의 인젠션마다 새로운 객체 인스턴스를 생성한다
// 때문에 메모리 상에서 다른 부분을 가리킨다