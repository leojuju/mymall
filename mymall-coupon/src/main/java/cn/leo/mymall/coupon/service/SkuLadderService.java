package cn.leo.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:52:37
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

