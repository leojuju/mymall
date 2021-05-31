package cn.leo.mymall.coupon.dao;

import cn.leo.mymall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:52:36
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
