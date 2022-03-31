package com.wuzx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/server")
public class ServerController {


    @Value("${spring.application.name}")
    private String applcationName;

    @Value("${server.port}")
    private String port;



    @GetMapping("/info")
    public String getServerInfo() {
        return applcationName + port;
    }

}
