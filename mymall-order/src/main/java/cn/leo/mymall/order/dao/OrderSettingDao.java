package cn.leo.mymall.order.dao;

import cn.leo.mymall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:31
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
