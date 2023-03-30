package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

/* ## actuator 는 왜 필요한가?
*	앱을 모니터하고 관리하기 위해서
*	앱의 상태를 추적하기 위해서
*
* 앱의 엔드포인트들을 쉽게 관리할 수 있게 해준다
* 베이스 url 은 /actuator 이고 추가 엔드포인트들이 제공된다
* /health 엔드포인트로 앱이 up 인지 down 인지 상태를 관리할 수 있다
* /info  엔드포인트도 사용할 수 있다(인포메이션 제공)
* /beans
* application.properties 에서 앱인포에 대한 내용을 업데이트 할 수 있다
*
*
* */

/* application.properties 파일
* # 기본적으로는 /health 엔드포인트만 제공 되고 나머지는 추가 설정으로 열 수 있다
# 콤마를 이용해서 특정 엔드포인트들만 열리도록 제한할 수 있다
# management.endpoints.web.exposure.include=health, info 이런 식으로
# * (와일드카드)를 사용하면 해당 설정으로 모든 엔드포인트들이 열린다
management.endpoints.web.exposure.include=*
management.info.env.enabled=true

# 앱에 대한 info 를 추가할 수 있다(/actuator/info 해당 url에 접근하면 객체의 형태로 제공된다)
# json formatter 크롬 익스텐션을 설치하면 좀 더 정돈된 데이터를 볼 수 있다
info.app.name=sexy
info.app.description=zzz!
info.app.version=1.0.0
* */