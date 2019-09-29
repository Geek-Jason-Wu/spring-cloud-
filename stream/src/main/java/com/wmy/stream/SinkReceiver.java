package com.wmy.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

// 将该类绑定为Sink
@EnableBinding(Sink.class)
public class SinkReceiver {

     // stream的监听注解 用来监听消息中接收到的数据
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        System.out.println("received: " + payload);
    }

}

