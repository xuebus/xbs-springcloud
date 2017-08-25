package com.zhaopin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by SYJ on 2017/8/25.
 */
@EnableFeignClients
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class XbsFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(XbsFeignApplication.class, args);
    }
}
