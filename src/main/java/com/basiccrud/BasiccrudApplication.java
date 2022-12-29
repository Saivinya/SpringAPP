package com.basiccrud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class BasiccrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(BasiccrudApplication.class, args);
	}

//	public static void main(String[] args) {
//		ApplicationContext ctx = SpringApplication.run(BasiccrudApplication.class, args);
//		BasiccrudApplication bsic = ctx.getBean(BasiccrudApplication.class);
//		System.out.println(bsic.test());
//		// bsic.test();
//	}
//
//	@GetMapping("/get")
//	public Employee test() {
//		Employee e = new Employee(12, "Vinya", "200044.404");
//		return e;
//	}
	@Bean
	public Docket productApi() {
	return new Docket(DocumentationType.SWAGGER_2).select()
	.apis(RequestHandlerSelectors.basePackage("com.basiccrud")).build();
	}

}
