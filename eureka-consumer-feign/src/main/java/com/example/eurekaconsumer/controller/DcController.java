package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.inter.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangdingshan
 * @Date: 2018/10/19 13:34
 * @Description:
 */
@RestController
public class DcController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}
