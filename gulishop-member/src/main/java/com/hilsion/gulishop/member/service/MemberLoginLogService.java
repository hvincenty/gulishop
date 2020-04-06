package com.hilsion.gulishop.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:47:50
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

