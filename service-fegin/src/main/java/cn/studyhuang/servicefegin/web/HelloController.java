package cn.studyhuang.servicefegin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.studyhuang.servicefegin.rpc.HelloRpcService;

@RestController
@RequestMapping("fegin")
public class HelloController {

    @Autowired
    HelloRpcService helloService;

    @GetMapping("/hello")
    public String getProvideForHello(String name) {
        return helloService.sayHelloSerive(name);
    }
}
