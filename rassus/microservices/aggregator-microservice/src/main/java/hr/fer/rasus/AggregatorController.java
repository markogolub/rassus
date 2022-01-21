package hr.fer.rasus;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AggregatorController {

    private final AggregatorService aggregatorService;

    @GetMapping("/")
    public List<Data> getData() {
        return aggregatorService.getAggregatedResponse();
    }
}
