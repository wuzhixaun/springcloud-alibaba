package com.wuzx.points.controller;

import com.wuzx.points.entity.Points;
import com.wuzx.points.service.PointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/points")
public class PointsController {

    @Autowired
    private PointsService pointsService;

    @GetMapping("/increase")
    public void increase(String username, Integer points) {
        pointsService.increase(username, points);
    }
}
