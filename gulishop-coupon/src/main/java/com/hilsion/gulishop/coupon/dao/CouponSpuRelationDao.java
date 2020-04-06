package com.hilsion.gulishop.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.coupon.entity.CouponSpuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:36:20
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {

}
