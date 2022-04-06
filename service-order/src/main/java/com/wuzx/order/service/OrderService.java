package com.wuzx.order.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.wuzx.order.entity.Order;

public interface OrderService extends IService<Order> {
    void add(Order order);
}
