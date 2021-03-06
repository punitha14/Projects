package com.java4s.app;

	 
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.pojo.AccountDetails;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
	 
	/**
	 * @author Crunchify.com - Simple Spring Boot Example
	 *
	 */
	 

	// @RestController is a convenience annotation that is itself annotated with @Controller and @ResponseBody
	@RestController
	 
	// @EnableAutoConfiguration enables auto-configuration of the Spring Application Context, attempting to guess
	// and configure beans that you are likely to need.

	@EnableAutoConfiguration
	@EnableSwagger2
	public class HelloWorldSpringBoot {
		   double depAmt;
		   String accountStatus="";
		// @RequestMapping annotation is used for mapping web requests onto specific handler classes
		@RequestMapping("/")
		String basicURL() {
			return "Welcome to Spring Boot Hello World Tutorial";
		}
	 
		@RequestMapping("crunchify")
		String crunchifyURL() {
			return "Hello Crunchify Friends! This is your first SpringBoot Example. Isn't that so Simple?";
		}
		
		@PostMapping("testapi")
		public String addName(@RequestBody String name) { 
		   // return "Hello : " + name;
		    return "Hello : " + name;
		}
		
		@PostMapping("accountconfig")
		public AccountDetails createProduct(@RequestBody AccountDetails accountDetails) {
		    // custom logic
			depAmt = accountDetails.getDepositAmount();
			accountStatus = accountDetails.getAccountStatus();
			 System.out.println("Account No: " + accountDetails.getAccountNo() + " Account Name: " + accountDetails.getAccountName() +
				        " address: " + accountDetails.getAddress() + " depositAmount: " + accountDetails.getDepositAmount());
		    return accountDetails;
		}
		
		@PostMapping("balanceinquiry")
		public double balanceInquiry(@RequestParam(value = "accountName") String accountName) { 
		 return depAmt;
		}
		
				      
		@PostMapping("accountstatus")
		public String accountStatus(@RequestParam(value = "accountName") String accountName) { 
		   // return "Hello : " + name;
		    return accountStatus;
		}
		
		
		
	   public static void main(String[] args) throws Exception {
	 
			// SpringApplication classes that can be used to bootstrap and launch a Spring application from a Java
			// main method. By default class will perform the following steps to bootstrap your application.
			SpringApplication.run(HelloWorldSpringBoot.class, args);
		}
	 
	}


