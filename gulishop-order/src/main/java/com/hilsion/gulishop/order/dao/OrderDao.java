package com.hilsion.gulishop.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:56:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
