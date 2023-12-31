package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekhaClientService2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaClientService2Application.class, args);
	}

}
