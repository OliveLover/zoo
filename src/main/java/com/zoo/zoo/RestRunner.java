package com.zoo.zoo;

import com.zoo.zoo.model.dto.AdoptRequestDto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static com.zoo.zoo.model.entity.AnimalType.FOX;

@Component
public class RestRunner  implements ApplicationRunner {
    private final RestTemplateBuilder restTemplateBuilder;

    public RestRunner(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        RestTemplate restTemplate = restTemplateBuilder.build();

        AdoptRequestDto requestDto = new AdoptRequestDto(FOX, "미호", "female");

        ResponseEntity<String> first = restTemplate.postForEntity("http://localhost:8080/animal", requestDto, String.class);
        System.out.println(first.getBody());
    }
}
