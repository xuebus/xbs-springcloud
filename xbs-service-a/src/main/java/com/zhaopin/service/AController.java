package com.zhaopin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SYJ on 2017/8/25.
 */
@RestController
@RequestMapping(value = "/a")
public class AController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getTime(){
        return "a: " + System.currentTimeMillis();
    }

    @RequestMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = client.getLocalServiceInstance();
        Integer r = a + b;
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort() + " " + serviceInstance.getServiceId() + " " + r);
        System.out.println(client.description());
        System.out.println(client.getServices());
        return r;
    }
}
