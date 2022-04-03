package com.shopping.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableWebMvc
//@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
public class SwaggerConfig implements WebMvcConfigurer {



	


}