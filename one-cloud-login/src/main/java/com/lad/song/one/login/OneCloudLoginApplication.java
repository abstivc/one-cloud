package com.lad.song.one.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OneCloudLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneCloudLoginApplication.class, args);
    }

}
