package cn.leo.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:52:37
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

