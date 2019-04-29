package com.tfx.example.eureka.consumer.feign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-09-19 12:01
 */
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("dc")
    String consumer();
}
