package cn.leo.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:30
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

