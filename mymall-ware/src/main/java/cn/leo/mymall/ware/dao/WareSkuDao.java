package cn.leo.mymall.ware.dao;

import cn.leo.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:55:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
