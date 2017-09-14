package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

// URL: http://localhost:8080
// URL: http://localhost:8080/product/list

// JAR version
@SpringBootApplication
public class SpringBootMysqldbApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqldbApplication.class, args);
	}
}

/* WAR version
@SpringBootApplication
public class SpringBootMysqldbApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootMysqldbApplication .class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqldbApplication .class, args);
	}
} */