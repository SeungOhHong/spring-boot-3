package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

// # Spring Boot Dev tools 란?

/*
 *   코드에 변경 사항이 있을 때 자동으로 앱을 재실행시켜준다
 *   폼파일에 스프링 데브툴 디펜던시를 추가해준다
 *   인텔리제이 커뮤니티 에디션은 따로 추가 설정이 필요하다
 *   file - settings - build, Execution ... - Compiler - build project automatically 체크
 *   advanced Settins - allow auto-make ... 체크
 * */
