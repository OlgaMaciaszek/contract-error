package io.pivotal.dmfrey.contracterror.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiClient {

    private final RestTemplate restTemplate;

    public ApiClient( final RestTemplate restTemplate ) {

        this.restTemplate = restTemplate;

    }

    public String callApi() {

        ResponseEntity<String> response = restTemplate.getForEntity( "https://simple-api/api/v1/simple", String.class );

        return response.getBody();
    }

}
