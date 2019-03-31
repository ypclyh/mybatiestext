package com.mybatiestext;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatiestext.dao")
public class MybatiestextApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatiestextApplication.class, args);
	}

}
