package cn.studyhuang.serviceprovide.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hello")
    public  String hello(String name) {
        return "hello,Worlkd!!!"+name+"  port:"+port;
    }
}
