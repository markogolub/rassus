package hr.fer.rasus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureHandler {
    Logger logger = LoggerFactory.getLogger(TemperatureHandler.class);

    @GetMapping("/")
    public Temperature getTemperature() {
        Temperature temperature = new Temperature(10);
        logger.info("{}", temperature);
        return temperature;
    }
}
