package cn.leo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:54:11
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

