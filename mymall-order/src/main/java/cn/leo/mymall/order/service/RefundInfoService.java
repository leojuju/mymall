package cn.leo.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:53:31
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

