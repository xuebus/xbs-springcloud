package com.zhaopin.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SYJ on 2017/8/25.
 */
@RestController
@RequestMapping(value = "/b")
public class BController {

    @RequestMapping(value = "/time", method = RequestMethod.GET)
    public String getTime(){
        return "b: " + System.currentTimeMillis();
    }
}
