package com.wenyb.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author wenyabing
 * @Date 2019/9/10 17:20
 */
@RestController
public class HiController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";


    @RequestMapping(value = "/consumer")
    public String hi() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/hi", String.class);
    }
}
