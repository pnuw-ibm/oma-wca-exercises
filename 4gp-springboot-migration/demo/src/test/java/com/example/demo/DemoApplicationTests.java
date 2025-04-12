package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloWorld() throws Exception {
        // Mock the DemoApplication class to return a specific string
        when(DemoApplication.helloWorld()).thenReturn("Mocked Hello, World!");

        // Perform a GET request to the root URL
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.content().string("Mocked Hello, World!"));
    }

}
