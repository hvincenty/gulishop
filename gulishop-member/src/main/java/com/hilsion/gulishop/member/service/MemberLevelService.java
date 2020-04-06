package com.hilsion.gulishop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:47:50
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

