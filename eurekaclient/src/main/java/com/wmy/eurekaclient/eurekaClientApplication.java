package com.wmy.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //eurekake客户端，应用启动时会想服务端注册服务信息
@SpringBootApplication
public class eurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(eurekaClientApplication.class, args);
	}

}
