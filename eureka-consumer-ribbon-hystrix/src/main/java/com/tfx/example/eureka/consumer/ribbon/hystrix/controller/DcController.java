package com.tfx.example.eureka.consumer.ribbon.hystrix.controller;

import com.tfx.example.eureka.consumer.ribbon.hystrix.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-08 14:38
 */
@RestController
public class DcController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc(){
        return  consumerService.consumer();
    }
}
