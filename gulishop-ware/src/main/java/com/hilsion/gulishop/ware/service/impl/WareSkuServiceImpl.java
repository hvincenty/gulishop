package com.hilsion.gulishop.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.common.utils.Query;
import com.hilsion.gulishop.ware.dao.WareSkuDao;
import com.hilsion.gulishop.ware.entity.WareSkuEntity;
import com.hilsion.gulishop.ware.service.WareSkuService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements WareSkuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSkuEntity> page = this.page(
                new Query<WareSkuEntity>().getPage(params),
                new QueryWrapper<WareSkuEntity>()
        );

        return new PageUtils(page);
    }

}