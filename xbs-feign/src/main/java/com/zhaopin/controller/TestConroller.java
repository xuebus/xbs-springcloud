package com.zhaopin.controller;

import com.zhaopin.service.ServiceAClient;
import com.zhaopin.service.ServiceBClient;
import com.zhaopin.service.XServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SYJ on 2017/8/25.
 */
@RestController
@RequestMapping(value = "/feign")
public class TestConroller {

    @Autowired
    private ServiceAClient serviceAClient;

    @Autowired
    private ServiceBClient serviceBClient;

    @Autowired
    private XServiceClient xServiceClient;

    /**
     * http://localhost:4444/feign/a
     * @return
     */
    @RequestMapping(value = "/a", method = RequestMethod.GET)
    String getATime(){
        String result = serviceAClient.getATime();
        System.out.println("\nFeign 调用 getATime方法...当前时间:[" + result +"]\n");
        return result;
    }

    /**
     * http://localhost:4444/feign/b
     * @return
     */
    @RequestMapping(value = "/b", method = RequestMethod.GET)
    String getBTime(){
        String result = serviceBClient.getBTime();
        System.out.println("\nFeign 调用 getBTime方法...当前时间:[" + result +"]\n");
        return result;
    }

    /**
     * http://localhost:4444/feign/getCompanyInfoById/100000079/12007036/1
     * @param a
     * @param b
     * @param c
     * @return
     */
    @RequestMapping(value = "/getCompanyInfoById/{a}/{b}/{c}")
    String getCompanyInfoById(@PathVariable Long a, @PathVariable Long b, @PathVariable Integer c){
        System.out.println("Feign 调用RD查询公司信息接口...");
        return xServiceClient.getCompanyInfoById(a, b, c);
    }
}
