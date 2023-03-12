package wali.hassan.jwtmicroServics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import wali.hassan.jwtmicroServics.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class JwtMicroServicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtMicroServicsApplication.class, args);
	}

}
