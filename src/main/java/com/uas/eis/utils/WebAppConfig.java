package com.uas.eis.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.uas.eis.utils.support.InterceptorConfig;

@Configuration
public class WebAppConfig extends WebMvcConfigurationSupport{

	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/hello");
	}
	
}
