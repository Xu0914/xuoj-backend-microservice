package com.xu.xuojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xu.xuojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xu")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xu.xuojbackendserviceclient.service"})
public class XuojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuojBackendUserServiceApplication.class);
    }
}
