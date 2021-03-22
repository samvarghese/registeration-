package com.employeeInfo.registeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.employeeInfo"})
@EnableJpaRepositories(basePackages={"com.employeeInfo.dao"})
@EntityScan(basePackages= "com.employeeInfo.entity")
public class EmployeeRegisterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegisterationApplication.class, args);
	}

}
