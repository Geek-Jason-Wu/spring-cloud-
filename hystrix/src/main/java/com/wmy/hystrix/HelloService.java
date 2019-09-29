package com.wmy.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private final static String url = "远程服务地址";

    @HystrixCommand(fallbackMethod = "helloFallBack")
    public String helloService() throws Exception {
        // 延迟实现服务阻塞，是直接调用helloFallBack方法
        Thread.sleep(5000);
        return "success";
    }

    private String helloFallBack() {
        return "error";
    }
}
