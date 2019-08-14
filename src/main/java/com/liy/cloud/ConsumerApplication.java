package com.liy.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {

    public static void main(String[] args) {
       Environment env = SpringApplication.run(ConsumerApplication.class, args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "服务 '{}' 启动完成! \n\t" +
                        "端口(s): \t{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"));
    }

}
