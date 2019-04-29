package com.tfx.example.eureka.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-09-19 14:05
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;
    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }
}
