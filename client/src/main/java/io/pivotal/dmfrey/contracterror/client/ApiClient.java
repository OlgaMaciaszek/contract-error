package io.pivotal.dmfrey.contracterror.client;

import java.net.URI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
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

        RequestEntity request = RequestEntity.get(URI.create("http://simple-api/api/v1/simple"))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        ResponseEntity<String> response = restTemplate
                .exchange(request, String.class);

        return response.getBody();
    }

}
