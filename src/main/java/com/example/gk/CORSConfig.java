package com.example.gk;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CORSConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
		@Override
		public void addCorsMappings(CorsRegistry corsRegistry) {
			corsRegistry.addMapping("/**")
						.allowedOriginPatterns("*")
						.allowedMethods("GET","POST","PUT","DELETE")
						.allowedHeaders("*")
						.allowCredentials(true);
		}
		};
	}
}