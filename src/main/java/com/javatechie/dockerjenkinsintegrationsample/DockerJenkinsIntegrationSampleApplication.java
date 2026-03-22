package com.javatechie.dockerjenkinsintegrationsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationSampleApplication {

    public static void main(String[] args) {
        System.out.println("Test message");
        SpringApplication.run(DockerJenkinsIntegrationSampleApplication.class, args);
    }

    public void hello(){
        System.out.println("This is hello method");
    }

}
