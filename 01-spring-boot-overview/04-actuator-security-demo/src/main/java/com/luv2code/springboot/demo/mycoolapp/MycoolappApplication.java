package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

/* actuator-security
*	 하지만 앱에 대한 모든 정보를 노출시키고 싶지는 않을 것이다
*	엔드포인트를 안전하게 관리하기 위해서 스프링부트security 디펜던시를 이용한다 
* actuator 엔드포인트에 접근 시 로그인을 하도록 유도한다
* 앱프로퍼티 파일에 유저이름과 비밀번호를 추가할 수 있다
* 특정 엔드포인트를 닫을 수도 있다
* 이런 식으로 특정 엔드포인트를 exclude해준다
# management.endpoints.web.exposure.exclude=health,info
* */