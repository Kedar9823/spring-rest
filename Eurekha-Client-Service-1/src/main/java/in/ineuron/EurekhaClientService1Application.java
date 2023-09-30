package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekhaClientService1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaClientService1Application.class, args);
	}

}
