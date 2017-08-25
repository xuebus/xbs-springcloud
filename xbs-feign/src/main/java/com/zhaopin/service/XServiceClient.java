package com.zhaopin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SYJ on 2017/8/25.
 */
@FeignClient(name = "rdapi", url = "http://rdapi.zpidc.com")
@RequestMapping(value = "/company")
public interface XServiceClient {

    //http://rdapi.zpidc.com/company/getcompanyinfobyid/100000079/12007036/1
    @RequestMapping(value = "/getcompanyinfobyid/{a}/{b}/{c}")
    String getCompanyInfoById(@PathVariable("a") Long a, @PathVariable("b") Long b, @PathVariable("c") Integer c);
}
