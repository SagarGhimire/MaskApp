package com.Mask.NWMSUMask;

import com.Mask.NWMSUMask.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EntityScan(basePackages = {"com/Mask/NWMSUMask/model"})
@ComponentScan(basePackages = {"Service"})
@ComponentScan(basePackages = {"Repository"})
public class NwmsuMaskApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NwmsuMaskApplication.class, args);
	}

}
