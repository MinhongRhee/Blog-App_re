package com.cos.blogapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cos.blogapp.handler.SessionInterceptor;

@Configuration
public class WedMvcConfig implements WebMvcConfigurer{
	public WedMvcConfig() {
		
	}
		
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new SessionInterceptor())
			.addPathPatterns("/api/**");
	}
}
