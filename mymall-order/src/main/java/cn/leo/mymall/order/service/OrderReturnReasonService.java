package cn.leo.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:31
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

