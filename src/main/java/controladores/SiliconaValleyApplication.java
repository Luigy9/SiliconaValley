package controladores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("entidades")
@EnableJpaRepositories("repositorios")
@EnableAutoConfiguration
public class SiliconaValleyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiliconaValleyApplication.class, args);
	}

}
