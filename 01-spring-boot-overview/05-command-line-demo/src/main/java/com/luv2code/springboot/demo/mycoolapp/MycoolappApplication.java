package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

// IDE 외부에서 스프링 부트 앱을 실행하고 싶을 때 사용하는 것이 커맨드 라인이다
// 우리는 스프링 부트를 사용하고 있기 떄문에 우리의 서버는 JAR파일에 임베디드 돼있다
// 때문에 톰켓같은 서버를 따로 설치하고 실행할 필요가 없다. 스프링 부트 앱은 이미 스텐드어론하기 떄문이다

// 커멘드 라인으로 실행하는 옵션은 2가지이다
/*
* 1. java -jar (파일이름.jar)
*	2. 스프링부트 메이븐 플러그인 이용
* mvnw package   -> 앱을 위한 JAR파일을 생성해준다 -> build successful이 뜨면
* java -jar (파일이름.jar) 명령어를 실행해준다.
* JAR 파일은 target폴더에 생성되기 때문에
* cd target
* ls *.jar
* java -jar (파일이름.jar)
* 
* 이미 메이븐패키지가 설치 됐을 경우 처음부터 아래 커맨드
* ./mvnw spring-boot:run
* */

/*
*
*
* */