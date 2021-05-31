package cn.leo.mymall.product.dao;

import cn.leo.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:54:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
