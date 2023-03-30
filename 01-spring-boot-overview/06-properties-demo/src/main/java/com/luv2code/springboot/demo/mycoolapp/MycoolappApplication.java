package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

//  application.properties 파일을 이용해서 스프링 부트 앱에 커스텀 프로퍼티 주입하기
// @Value 어노테이션  를 이용해서 프로퍼티에 접근가능하다
/*
*  1. 커스텀 프로퍼티 정의하기
* 	2. 앱에 프로퍼티 주입하기
*
* */

/*
* # 프로퍼티 정의하기

coach.name=seungoh
team.name=soso

#
# 임베디드 포트번호 바꾸기
#
server.port=7070

#
# 앱의 컨텍스트 경로 지정하기
#
# 모든 요청에 대한 url에 /soba가 프리픽스된다
server.servlet.context-path=/soba/
*
* 시큐리티 사용자 이름이랑 비밀번호 바꾸기
* spring.security.user.name=soba
* spring.security.user.password=soba
*
*
* 이 외에도 여러가지 커스텀 프로퍼티가 있다(아래 링크 참고)
* https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties
 */

