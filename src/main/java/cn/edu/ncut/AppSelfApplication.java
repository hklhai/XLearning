package cn.edu.ncut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.edu.ncut")
public class AppSelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppSelfApplication.class, args);
	}
}
