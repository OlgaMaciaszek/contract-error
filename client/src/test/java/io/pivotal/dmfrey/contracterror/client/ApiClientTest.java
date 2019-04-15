package io.pivotal.dmfrey.contracterror.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class )
@SpringBootTest
@AutoConfigureStubRunner( stubsMode = StubRunnerProperties.StubsMode.LOCAL )
@ActiveProfiles( "test" )
public class ApiClientTest {

    @Autowired
    private ApiClient client;

    @Test
    public void testApiCall() {

        String actual = this.client.callApi();

        String expected = "{\"simple\":{\"dateCompleted\":\"2019-04-15\",\"message\":\"a test message\"}}";

        assertThat( expected ).isEqualTo( actual );

    }

}