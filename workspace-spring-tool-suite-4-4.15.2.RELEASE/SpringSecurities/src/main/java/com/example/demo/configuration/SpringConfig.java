package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SpringConfig  extends WebSecurityConfigurerAdapter{

	@Autowired
	UserDetailsService service;
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("amit").password("1234").roles("USER")
//        .and().withUser("admin").password("root").roles("ADMIN");
		auth.userDetailsService(service);
        
    }




    @Override
    protected void configure(HttpSecurity http) throws Exception {
    
        http.authorizeRequests()
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/user/**").hasAnyRole("ADMIN","USER")
        .antMatchers("/welcome").permitAll()
        .and().formLogin();
    }



       @Bean
        PasswordEncoder passwordencoder() {
            return NoOpPasswordEncoder.getInstance();
            
        }	

}
