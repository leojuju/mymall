package cn.leo.mymall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.leo.mymall.member.dao")
@SpringBootApplication
public class MymallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymallMemberApplication.class, args);
	}

}
