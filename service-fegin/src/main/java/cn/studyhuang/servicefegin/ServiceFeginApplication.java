package cn.studyhuang.servicefegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients 开启fegin功能
 * 1.在启动类添加注解 @EnableFeignClients
 * 2.创建一个接口 指明要调用的远程服务 @FeignClient(value = "service-provide")
 * 3.暴露接口，调用远程服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeginApplication.class, args);
    }
}

/*
  1.Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，
  只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
  Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
  2.Feign 采用的是基于接口的注解
  3.Feign 整合了ribbon，具有负载均衡的能力
  4.整合了Hystrix，具有熔断的能力

 */