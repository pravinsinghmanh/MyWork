package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // <-- Add this import
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloMessage() throws Exception {
        mockMvc.perform(get("/first_project/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello"));
    }

    @Test
    void shouldReturnDynamicHelloMessage() throws Exception {
        mockMvc.perform(post("/first_project/hello")
                        .param("name", "pravin"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hellopravin"));

    }
}


