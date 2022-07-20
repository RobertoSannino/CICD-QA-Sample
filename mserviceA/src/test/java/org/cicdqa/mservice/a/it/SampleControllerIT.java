package org.cicdqa.mservice.a.it;

import org.cicdqa.mservice.a.rest.SampleController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class SampleControllerIT {

    @Autowired
    private MockMvc mockMvc;

	@Test
	void testHomePage() throws Exception {
        final SampleController sampleController = new SampleController();
        mockMvc = MockMvcBuilders.standaloneSetup(sampleController).build();

        String homePageMessage = mockMvc.perform(get("/api/a/home"))
            .andExpect(status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();

        Assertions.assertEquals("*** Micro-Service A !!! ***", homePageMessage);
	}

}
