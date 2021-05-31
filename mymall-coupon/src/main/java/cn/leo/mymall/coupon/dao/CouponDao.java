package cn.leo.mymall.coupon.dao;

import cn.leo.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:52:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
