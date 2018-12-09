package cn.studyhuang.servicefegin.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.studyhuang.servicefegin.HystrixErrorDemo.HystrixError;

/**
 * 定义要调用的远程服务
 * @FeignClient(value = "service-provide") 调用的远程服务名称
 * fallback ====>hystrix
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = HystrixError.class)
public interface HelloRpcService {

    @GetMapping("/test/hello")
    String sayHelloSerive(@RequestParam(value = "name",defaultValue = "huangjy") String name);
}
