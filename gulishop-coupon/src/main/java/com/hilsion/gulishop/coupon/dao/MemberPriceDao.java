package com.hilsion.gulishop.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:36:20
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
