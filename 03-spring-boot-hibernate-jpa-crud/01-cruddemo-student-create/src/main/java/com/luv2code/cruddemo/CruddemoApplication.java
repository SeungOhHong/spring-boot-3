package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	
	// 커맨드라인 어플리케이션 설치하기 -> 스프링 부트 프레임 워크에서 지원하다. 스프링 빈이 로드된 후에 실행된다
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			// 자바 람바 표현식이다.
			createStudent(studentDAO);

			createMultipleStudents(studentDAO);

		};
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}

/* 하이버네이트란 ?
* 자바 객체를 DB에 저장하기 위한 프레임워크이다*
*	로우레벨의 SQL을 다룰 수 있다
* JDBC 코드의 양을 줄일 수 있다
*	ORM(객체-관계 맵핑)을 지원한다(Object-to-Relational Mapping) 객체
*	ORM을 지원하기 때문에 자바 클래스와 DB 테이블 간의 맵핑을 정의하면 된다
*
*
* */

/* MySQL
* CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';
*
* id 가 springstudent 이고
* 비밀번호가 springstudent 인 새로운 유저를 생성하였다
* IDENTIFIED BY 위의 문자열이 비밀번호이다
* */

/*
application.properties 파일에 JDBC 연결에 관한 info를 추가한다
spring.datasource.url=jdbc:mysql://localhost:3306/student_tracker
spring.datasource.username=springstudent
spring.datasource.password=springstudent

# Turn off the Spring Boot banner
spring.main.banner-mode=off

# 오류가 없으면 따로 로그를 생략해주는 코드이다
Reduce logging level. Set logging level to warn
logging.level.root=warn
* */



