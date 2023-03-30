package com.luv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}

// 스프링 컨테이너를 설정하는 데에는 크게 3가지 방법이 있다
/*
*	1. XML 설정(레거시)
*	2. 자바 어노테이션
*	3. 자바 소스코드
*
*
* 스프링 컨테이너는 객체 공장 같은 역할을 한다
* 앱에서 스프링 컨테이너에 "코치 객체를 줘" 라고 요청하면 이 코치 객체는 여러가지 디펜던시들을 가지고 있다
* 예를 들면, 테니스 코치, 야구 코치, 축구 코치 등등
*
*	스프링 컨테이너는 크게 두가지의 기능을 한다
* 1. 총괄 객체를 생성한다(역전 제어)
*	2. 또한 객체 디펜던시들을 주입한다 (의존성 주입)
*
* 의존성 주입은 크게 두가지 방식을 가지고 있다
* 1. 생성자 주입(Constructor Injection)
* 2. 새터 주입(Setter Injection)
*
* 1. 생성자 주입 순서
* 	1) 디펜던시 인터페이스와 클래스 정의하기
* 	클래스는 @Component 어노테이션을 갖게 된다. 이 어노테이션을 갖는 클래스는 스프링 빈에서 의존성주입의 후보로 간주한다
* 	스프링 빈이란 스프링에서 관리하는 함수이다.
*		2) REST 컨트롤러 생성
* 	 @RestController 어노테이션을 이용한다
 * 	3) 클래스에 주입을 위한 생성자 생성
 * 	@Autowired 어노테이션을 이용한다. 이 어노테이션이 스프링에게 의존성을 주입하라고 명령한다
*
*		4) /dailyworkout 에 @GetMapping 어노테이션 추가하기
* 	엔드포인트에서 getDailyWorkout() 메서드를 리턴하도록 해준다
* */