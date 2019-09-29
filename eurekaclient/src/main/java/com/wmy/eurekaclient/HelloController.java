package com.wmy.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String index(){
        List<String> services = client.getServices();

        services.stream().forEach(item ->{
            System.out.println(item);
            // 获取注册中心所有的服务实例
            List<ServiceInstance> instances = client.getInstances(item);
            instances.stream().forEach(aa -> {
                System.out.println(aa.getHost());
                System.out.println(aa.getInstanceId());
                System.out.println(aa.getPort());
                System.out.println(aa.getServiceId());
                System.out.println(aa.getUri());
            });
        });
        return "Hello World";
    }

}
