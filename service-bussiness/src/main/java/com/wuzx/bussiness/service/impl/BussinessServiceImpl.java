package com.wuzx.bussiness.service.impl;

import com.wuzx.bussiness.feign.OrderServiceFeign;
import com.wuzx.bussiness.feign.PointsServiceFeign;
import com.wuzx.bussiness.feign.StorageServiceFeign;
import com.wuzx.bussiness.service.BussinessService;
import com.wuzx.bussiness.utils.IdWorker;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务逻辑
 */
@Service
public class BussinessServiceImpl implements BussinessService {

    @Autowired
    OrderServiceFeign orderServiceFeign;
    @Autowired
    PointsServiceFeign pointsServiceFeign;

    @Autowired
    StorageServiceFeign storageServiceFeign;

    @Autowired
    IdWorker idWorker;

    /**
     * 商品销售
     *
     * @param goodsId  商品id
     * @param num      销售数量
     * @param username 用户名
     * @param money    金额
     */
//    @Transactional
    @GlobalTransactional(rollbackFor = Exception.class,timeoutMills = 60000,name = "sale")
    public void sale(Integer goodsId, Integer num, Double money, String username) {
        //创建订单
        orderServiceFeign.addOrder(idWorker.nextId(), goodsId, num, money, username);
        //增加积分
        pointsServiceFeign.increase(username, (int) (money / 10));
        //扣减库存
        storageServiceFeign.decrease(goodsId, num);
    }
}
