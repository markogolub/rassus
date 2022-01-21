package hr.fer.rasus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack" , "true");
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
