package com.wuzx.points.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wuzx.points.entity.Points;

public interface PointsService extends IService<Points> {

    public void increase(String username, Integer points);
}
