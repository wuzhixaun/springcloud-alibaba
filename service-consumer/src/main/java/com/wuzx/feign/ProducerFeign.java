package com.wuzx.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-producer",path = "/server")
public interface ProducerFeign {


    @GetMapping("/info")
    String getServerInfo();
}
