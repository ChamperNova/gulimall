package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sss
 * @email sss@gmail.com
 * @date 2021-07-29 09:56:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
