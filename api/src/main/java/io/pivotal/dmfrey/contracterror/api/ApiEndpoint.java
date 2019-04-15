package io.pivotal.dmfrey.contracterror.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class ApiEndpoint {

    @GetMapping( "/api/v1/simple" )
    public ResponseEntity<SimpleResponse> simple() {

        Simple simple = new Simple( "a test message", LocalDate.of( 2019, 04, 15 ) );

        return new ResponseEntity<SimpleResponse>( SimpleResponse.builder().simple( simple ).build(), OK );
    }

}
