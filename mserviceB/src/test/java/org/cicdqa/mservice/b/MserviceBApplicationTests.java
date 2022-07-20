package org.cicdqa.mservice.b;

import org.cicdqa.mservice.b.rest.SampleController;
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
class MserviceBApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHomePage() throws Exception {
        final SampleController sampleController = new SampleController();
        mockMvc = MockMvcBuilders.standaloneSetup(sampleController).build();

        String homePageMessage = mockMvc.perform(get("/api/b/home"))
            .andExpect(status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();

        Assertions.assertEquals("*** Micro-Service B !!! ***", homePageMessage);
    }

}
