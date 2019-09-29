package com.wmy.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// hello-service 要对调用的服务 fallback 服务调用失败时的毁掉
@FeignClient(value = "hello-service", fallback = helloServiceImpl.class)
public interface helloService {

    // 调用hello-service服务中的hello接口
    @PostMapping("/hello")
    String hello();
}
