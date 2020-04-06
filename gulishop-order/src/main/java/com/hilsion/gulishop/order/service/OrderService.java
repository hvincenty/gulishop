package com.hilsion.gulishop.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:56:44
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

