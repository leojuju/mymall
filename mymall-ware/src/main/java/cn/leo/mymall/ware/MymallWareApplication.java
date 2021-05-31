package cn.leo.mymall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.leo.mymall.ware.dao")
@SpringBootApplication
public class MymallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymallWareApplication.class, args);
	}

}
