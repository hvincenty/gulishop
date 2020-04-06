package com.hilsion.gulishop.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.ware.entity.WareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 19:01:29
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {

}
