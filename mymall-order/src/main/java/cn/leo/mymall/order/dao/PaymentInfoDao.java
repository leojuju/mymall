package cn.leo.mymall.order.dao;

import cn.leo.mymall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:31
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
