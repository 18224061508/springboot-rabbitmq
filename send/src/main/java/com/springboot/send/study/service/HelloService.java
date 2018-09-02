package com.springboot.send.study.service;


import com.springboot.api.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class HelloService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("message")
    public String send(){
        User user =new User();
        user.setName("dingliwen");
        user.setPassword("12345");
        amqpTemplate.convertAndSend("strkey",user);
        return "success";
    }
}
