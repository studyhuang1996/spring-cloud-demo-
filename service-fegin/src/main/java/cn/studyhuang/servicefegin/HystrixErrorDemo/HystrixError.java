package cn.studyhuang.servicefegin.HystrixErrorDemo;

import org.springframework.stereotype.Component;

import cn.studyhuang.servicefegin.rpc.HelloRpcService;

@Component
public class HystrixError implements HelloRpcService {
    @Override
    public String sayHelloSerive(String name) {
        return "sorry,已经宕机了"+name;
    }
}
