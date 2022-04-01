package com.wuzx.controller;

import com.wuzx.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/server")
@RestController
public class ServerController {

    @Autowired
    ProducerFeign producerFeign;

    @GetMapping("/producer")
    public String getProducerInfo() {
        return producerFeign.getServerInfo();
    }

    @GetMapping("/timeout")
    public String testTimeOut() {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return producerFeign.getServerInfo();
    }
}
