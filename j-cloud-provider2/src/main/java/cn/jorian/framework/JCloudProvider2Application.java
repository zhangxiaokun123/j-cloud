package cn.jorian.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(JCloudProvider2Application.class, args);
    }

}
