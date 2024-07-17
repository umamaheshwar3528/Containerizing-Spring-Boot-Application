package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot controller class
 */
@RestController
public class HelloController {

    /**
     * HTTP GET requests to the root path ("/") and returns greeting message.
     *
     * @return message "Greetings from Spring Boot!!".
     */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!";
    }
}
