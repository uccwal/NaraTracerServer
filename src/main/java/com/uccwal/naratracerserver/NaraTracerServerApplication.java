package com.uccwal.naratracerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.uccwal.naratracerserver.entity")
@EnableJpaRepositories(basePackages = "com.uccwal.naratracerserver.repository")
public class NaraTracerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaraTracerServerApplication.class, args);
    }

}
