package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication  		  // 背后创建spring上下文
@MapperScan("cn.tedu.ssm.mapper") // 进行Mapper扫描，并创建实现类
public class RunAppSsm {
	 public static void main(String[] args) {
		SpringApplication.run(RunAppSsm.class,args);
	}
}
