package com.christian.qs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collection;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
public class PortfolioViewIntegrationTest {


    @Autowired
    MockMvc mockMvc;

    @Test
    public void givenPortfolioWithOpenPositionDisplaysPosition() throws Exception {
        // get /view

       MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.get("/view"))
                                   .andExpect(status().isOk())
                                    .andExpect(view().name("view"))
                                    .andExpect(model().attributeExists("positions"))
                                    .andExpect(model().attributeExists("positions"))
                                    .andReturn();

    // check for model containing "positions" List
    @SuppressWarnings("unchecked")
    Collection<String> positions = ( Collection<String>)
        mvcResult.getModelAndView()
                 .getModel()
                 .get("positions");
    assertThat(positions)
            .hasSize(1);




    }
}
