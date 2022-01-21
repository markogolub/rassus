package hr.fer.rasus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@RefreshScope
public class AggregatorService {
    Logger logger = LoggerFactory.getLogger(AggregatorService.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${unit}")
    private String unit;

    public AggregatorService() {
        unit = null;
    }

    public List<Data> getAggregatedResponse() {
        RestTemplate restTemplate = new RestTemplate();
        URI temperatureUri = discoveryClient.getInstances("temperature").get(0).getUri();
        URI humidityUri = discoveryClient.getInstances("humidity").get(0).getUri();
        ResponseEntity<Data> responseTemperature = restTemplate.getForEntity(temperatureUri, Data.class);
        ResponseEntity<Data> responseHumidity = restTemplate.getForEntity(humidityUri, Data.class);
        Data temperature = responseTemperature.getBody();
        Data humidity = responseHumidity.getBody();
        logger.info("{}", this.unit);
        if (this.unit.equals("K")) {
            temperature.unit = "K";
            temperature.value = temperature.value + 273;
        }
        List<Data> response = new ArrayList<>();
        response.add(temperature);
        response.add(humidity);
        logger.info("{}", response);
        return response;
    }
}
