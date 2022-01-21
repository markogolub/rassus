package hr.fer.rasus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HumidityMicroserviceApplication {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack" , "true");
        SpringApplication.run(HumidityMicroserviceApplication.class, args);
    }
}
