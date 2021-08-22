package com.lad.song.one.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OneCloudFileApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneCloudFileApplication.class, args);
    }
}
