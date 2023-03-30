// 새로운 패키지를 만들어준다
package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// rest 컨트롤러
@RestController
public class FunRestController {

    //  / 에 엑세스하면 "Hello world"를 리턴하도록 한다
// get 맵핑
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}

// Maven 이란 무엇인가?
// 메이븐은 프로젝트 관리 툴이다
// 여러가지 JAR 파일들을 직접 셋팅할 필요없이 메이븐이 알아서 해준다
// 쇼핑 카트처럼 필요한 디펜던시를 담기만 하면 메이븐이 알아서 다운로드해서 런타임시에 JAR 파일들을 자동으로 연동시켜준다
// 메이븐은 앱을 빌드할 때 class 와 빌드경로를 관리해준다
// config 설정파일에 근거해서 JAR 파일을 자동으로 추가해준다

// pom(Project Object Model) 파일이 메이븐 설정 파일이다(쇼핑 리스트)
// 폼 파일은 3가지로 구성 돼있다
/*
*   1. 프로젝트 메타데이터 : JAR , WAR 파일
*   2. 디펜던시 : 스프링, 하이버네이트
*   3. 플러그인들 : Junits 같은 툴
* */

// 메이븐은 스텐다드한 디렉토리 구조를 가지고 있다
// webapp폴더 -> JSP CSS 파일등이 있는 폴더이다. 만약 앱이 JAR 파일로 패키지 되어있다면 이 폴더는 사용하지 않는다. 왜냐하면 이 폴더는 WAR 패키징으로만 구동되기 때문이다. 주의해야한다

// 메이븐은 포터블 하기 때문에 IDE간에 프로젝트를 공유하기에 편리하다
// mvnw 파일은 메이븐 wrapper 파일들이다. 현재 메이븐 버전이 로컬에 존재하지 않을 경우 인터넷에서 자동으로 다운로드를 진행한다. 메이븐이 이미 인스톨 돼있다면 딱히 필요가 없는 파일이다(mvn clean compile test)

// resources 폴더의 application.properties 파일은 스프링 부트 프로퍼티 관리에 사용된다. 예를 들면 서버 포트번호를 바꾸거나 할 때 사용된다. 혹은 커스텀 프포퍼티를 여기에 모아두고 인젝션 한다


// # Spring Boot Starter란?
/*
*   메이븐 컬렉션을 모아놓은 것이다
*   pom파일의 artificialId 태그의 spring-boot-starter-web
*   이거 하나에 여러가지 디펜던시들이 묶여있다
*   어떤 스타터가 프로젝트에 포함되어있는지 볼 수 있다
*   View - Tool windows - Maven projects - Dependencies
* */

