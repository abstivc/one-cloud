package com.lad.song.one.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//开启服务注册发现功能
@EnableFeignClients//启动Feign功能
public class OneCloudFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneCloudFeignClientApplication.class, args);
    }
}
