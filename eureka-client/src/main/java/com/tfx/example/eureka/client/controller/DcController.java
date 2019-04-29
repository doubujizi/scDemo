package com.tfx.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-09-12 16:45
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/dc")
    public String dc() throws InterruptedException{
        //为了测试服务降级
        //Thread.sleep(5000L);
        String services = "Services: " +discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
