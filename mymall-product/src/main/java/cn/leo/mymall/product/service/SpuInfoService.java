package cn.leo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:54:10
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

