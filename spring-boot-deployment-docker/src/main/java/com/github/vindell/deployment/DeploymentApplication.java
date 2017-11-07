package com.github.vindell.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration //配置控制  
@EnableAutoConfiguration //启用自动配置  
@SpringBootApplication
public class DeploymentApplication {

	public static void main(String[] args) throws Exception {
        SpringApplication.run(DeploymentApplication.class, args);
    }
	
}
