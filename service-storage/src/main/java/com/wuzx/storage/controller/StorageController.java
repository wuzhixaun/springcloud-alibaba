package com.wuzx.storage.controller;

import com.wuzx.storage.entity.Storage;
import com.wuzx.storage.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/storage")
public class StorageController {
    @Resource
    private StorageService storageService;

    @GetMapping("/decrease")
    public void decrease(Integer goodsId, Integer quantity) {
        storageService.decrease(goodsId, quantity);
    }
}
