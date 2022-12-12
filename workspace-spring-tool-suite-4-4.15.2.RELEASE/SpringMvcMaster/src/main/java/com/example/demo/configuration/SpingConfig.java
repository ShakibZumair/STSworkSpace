package com.example.demo.configuration;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.example.demo.interceptor.MyLoginInterceptor;

@Configuration
public class SpingConfig extends WebMvcConfigurerAdapter{
@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource rs=new ResourceBundleMessageSource() ;
		rs.setBasename("messages");
		return rs;
		
	}

@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// TODO Auto-generated method stub
	registry.addResourceHandler("/img/**").addResourceLocations("/resources/images/");
}

//22-08-22==========
@Bean("localeResolver")
public LocaleResolver localeResolver() {
	SessionLocaleResolver resolver=new SessionLocaleResolver();
	resolver.setDefaultLocale(new Locale("en"));
	return resolver;
	
}

@Override
public void addInterceptors(InterceptorRegistry registry) {
	// TODO Auto-generated method stub
	LocaleChangeInterceptor localeInterceptor=new LocaleChangeInterceptor();
	localeInterceptor.setParamName("language");
	registry.addInterceptor(localeInterceptor);
}
//@Override
//public void addInterceptors(InterceptorRegistry registry) {
//	// TODO Auto-generated method stub
//	registry.addInterceptor(new MyLoginInterceptor());
//}


}
