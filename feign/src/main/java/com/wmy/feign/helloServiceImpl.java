package com.wmy.feign;

// 实现helloService接口，重写接口中方法，在接口中定位失败回调类为helloServiceImpl，
// 当调用hello-service服务中接口失败时会调用helloServiceImpl中对应的方法
public class helloServiceImpl implements helloService {
    @Override
    public String hello() {
        return "error";
    }
}
