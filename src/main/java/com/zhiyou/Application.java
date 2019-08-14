package com.zhiyou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;
//用来标识springboot的启动类  是一个组合注解，除了包括java 4大元注解以外 还包括以�?
/**
 * @SpringBootApplication：修饰在类上，可以代替xml配置，用来标识这个类是一个xml配置类，�?般与@bean结合使用
 * 		@bean：注解用来修饰方法上，该方法的返回�?�将会被注册spring容器�?
 * @EnableAutoConfiguration:自动配置spring上下文，可以猜测和配置我们想要的bean类型
 * @ComponentScan:会自动扫描指定包下面的component，controller等注解，并自动注入到IOC容器中，如果不指定路径，默认扫描自己�?在包路径及所有子包�??
 * 
 * @author Sunny
 *
 */
@SpringBootApplication
//@ComponentScan(value="com.yan.controller")  //自定义需要扫描的路径
//@ComponentScans(value= {   //自定义需要扫描的路径  复数
//		@ComponentScan("com.yan.dao"),
//		@ComponentScan("com.yan.service")
//})
@MapperScan("com.yan.mapper")  //自动扫描该路径下的所有接�?
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
