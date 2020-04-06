package com.hilsion.gulishop.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 19:01:28
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}
