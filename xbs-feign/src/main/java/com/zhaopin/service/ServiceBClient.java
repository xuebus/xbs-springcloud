package com.zhaopin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SYJ on 2017/8/25.
 */
@FeignClient("xbs-service-b")
@RequestMapping
public interface ServiceBClient {
    @RequestMapping(value = "/b/time", method = RequestMethod.GET)
    String getBTime();
}
