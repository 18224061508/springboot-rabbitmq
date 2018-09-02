package com.springboot.receive.study.service;

import com.springboot.api.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("receive")
public class HelloService {

    /**
     *监听队列的方法不能有任何返回值
     */
    @RabbitListener(queues = "strkey")
    @RequestMapping("process")
    public void process(User user){
        System.out.println("receive:" + user);
    }
}
