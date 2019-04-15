package io.pivotal.dmfrey.contracterror.api;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.mockMvc;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith( SpringRunner.class )
@SpringBootTest
@Ignore
public abstract class ContractBaseTest {

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {

        mockMvc(
                webAppContextSetup( context )
                        .build()
        );
    }

}
