package com.ecommerce.admin.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ecommerce.r2s.r2s_shop.*", "com.ecommerce.admin.admin.*"})
@EnableJpaRepositories(value = "com.ecommerce.r2s.r2s_shop.repository")
@EntityScan(value = "com.ecommerce.r2s.r2s_shop.entity")
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
