package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Saml2RefreshableMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(Saml2RefreshableMetadataApplication.class, args);
	}

}
