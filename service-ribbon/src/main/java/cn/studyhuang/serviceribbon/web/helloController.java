package cn.studyhuang.serviceribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.studyhuang.serviceribbon.service.HelloService;

@RestController
@RequestMapping("ribbon")
class helloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String helloToProvider() {
        return  helloService.getHelloSer("studyhuang");
    }
}
