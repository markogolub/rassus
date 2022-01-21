package hr.fer.rasus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TemperatureMicroserviceApplication {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack" , "true");
        SpringApplication.run(TemperatureMicroserviceApplication.class, args);
    }
}
