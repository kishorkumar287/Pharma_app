package com.project;

import java.io.IOException;
import java.util.HashMap;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com")
public class PharmapaymentApplication {

  
	public static void main(String[] args) throws MessagingException {
		SpringApplication.run(PharmapaymentApplication.class, args);
	
		
	}
	
	
	

	
	
	
	
	@Bean
	public HashMap<Integer,Integer> map()
	{
		return new HashMap<Integer,Integer>();
	}
	
	@Bean
	public LocalValidatorFactoryBean validate(MessageSource messageSource) {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();

		localValidatorFactoryBean.setValidationMessageSource(messageSource);
		return localValidatorFactoryBean;
	}

}
