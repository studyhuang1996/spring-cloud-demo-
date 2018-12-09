package cn.studyhuang.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者 使用restTemplate + ribbon
 * 使用ribbon 轮询调用接口
 * ribbon :Ribbon是一个客户端负载均衡器，它提供了对HTTP和TCP客户端的行为的大量控制。
 * Feign已经在使用Ribbon了，所以如果你在使用@FeignClient，那么这个部分也适用。
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * HystrixCommand 注解表示创建熔断器功能，
     * 当调用不通SERVICE-PROVIDER，熔断器会调用回调方法helloError，不能导致连锁故障
     * 控制了容器的线程阻塞
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "helloError")
    public String getHelloSer(String name) {

        return restTemplate.getForObject("http://SERVICE-PROVIDER:9000/test/hello?name="+name,String.class);
    }


    public String helloError(String name) {
        return "hello,this world destroy!!" +name;
    }
}
