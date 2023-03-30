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
