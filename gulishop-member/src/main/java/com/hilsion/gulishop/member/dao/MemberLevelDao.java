package com.hilsion.gulishop.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.member.entity.MemberLevelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:47:50
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

}
