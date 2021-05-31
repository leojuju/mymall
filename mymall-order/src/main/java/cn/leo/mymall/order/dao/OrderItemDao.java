package cn.leo.mymall.order.dao;

import cn.leo.mymall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:30
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
