package hr.fer.rasus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumidityHandler {
    Logger logger = LoggerFactory.getLogger(HumidityHandler.class);

    @GetMapping("/")
    public Humidity getHumidity() {
        Humidity humidity = new Humidity(48);
        logger.info("{}", humidity);
        return humidity;
    }
}
