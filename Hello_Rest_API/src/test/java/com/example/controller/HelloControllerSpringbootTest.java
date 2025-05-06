package com.example.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerSpringbootTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHello() {
        String name = "World";
        ResponseEntity<String> response = restTemplate.postForEntity("/first_project/hello?name=" + name, null, String.class);
        assertThat(response.getBody()).isEqualTo("Hello" + name);
    }
}
