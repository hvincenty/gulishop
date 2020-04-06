package com.hilsion.gulishop.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.ware.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 19:01:28
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {

}
