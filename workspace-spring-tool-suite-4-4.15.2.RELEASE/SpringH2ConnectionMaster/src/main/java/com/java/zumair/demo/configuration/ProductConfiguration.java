package com.java.zumair.demo.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;



import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;




@Configuration
public class ProductConfiguration  extends WebMvcConfigurerAdapter{



     @Bean
      public MessageSource  messageSource() {
          ResourceBundleMessageSource source = new ResourceBundleMessageSource();
          source.setBasename("messages");
          return source;
      }
     
}
