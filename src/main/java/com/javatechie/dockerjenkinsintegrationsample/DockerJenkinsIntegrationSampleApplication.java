package com.javatechie.dockerjenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

    public static void main(String[] args) {
        System.out.println("Test message");
        SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello API called successfully ...");
        return "This is hello method v0.1";
    }

}
