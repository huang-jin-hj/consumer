package com.yes.controller;

import com.hjhsf.HJHSFConsumer;
import com.provider.hsfclient.Provider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangJin on 2023/5/19.
 */
@RestController
public class MyController {

    @HJHSFConsumer
    Provider provider;
    @RequestMapping("/hello")
    public String hello(){
        return provider.test();
    }
}
