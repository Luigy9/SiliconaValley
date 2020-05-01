package dadSiliconaPackage;


import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootTest
@EntityScan("entidades")
@EnableJpaRepositories("repositorios")
@EnableAutoConfiguration
@SpringBootApplication
class SiliconaValleyApplicationTests {

	@Test
	void contextLoads() {
	}
	


}
