package com.hilsion.gulishop.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.common.utils.Query;
import com.hilsion.gulishop.order.dao.OrderReturnApplyDao;
import com.hilsion.gulishop.order.entity.OrderReturnApplyEntity;
import com.hilsion.gulishop.order.service.OrderReturnApplyService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderReturnApplyEntity> page = this.page(
                new Query<OrderReturnApplyEntity>().getPage(params),
                new QueryWrapper<OrderReturnApplyEntity>()
        );

        return new PageUtils(page);
    }

}