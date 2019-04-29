package com.tfx.example.eureka.consumer.ribbon.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-08 14:39
 */
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }

    public String fallback(){
        return "fallback";
    }
}
