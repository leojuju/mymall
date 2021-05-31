package cn.leo.mymall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cn.leo.mymall.product.entity.BrandEntity;
import cn.leo.mymall.product.service.BrandService;

@SpringBootTest
class MymallProductApplicationTests {

	@Autowired
	BrandService brandService;
	
	@Test
	void contextLoads() {
		
		BrandEntity be = new BrandEntity();
		be.setName("HuaWei");
		
		brandService.save(be);
	}

}
