package com.pjhu.keycloak.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
public class controller {

    @GetMapping("/secure")
    public String getUsers() {
        return "This is secure endpoint";
    }

    @GetMapping
    public List<String> home() {
        return Collections.singletonList("Home Page");
    }
}
