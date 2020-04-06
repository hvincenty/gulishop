package com.hilsion.gulishop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 19:01:28
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

