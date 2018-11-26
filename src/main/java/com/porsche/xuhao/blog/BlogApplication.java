package com.porsche.xuhao.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Xu hao
 * @Description 博客系统启动类
 * @Version 1.0
 * @Date 2018/11/12 20:38
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.porsche.xuhao.blog.dao")
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
