package com.gome.bi.bicloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BiCloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BiCloudConfigApplication.class, args);
    }
}
