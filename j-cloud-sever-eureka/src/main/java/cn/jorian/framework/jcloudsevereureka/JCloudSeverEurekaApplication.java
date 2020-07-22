package cn.jorian.framework.jcloudsevereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;




@SpringBootApplication
@EnableEurekaServer
public class JCloudSeverEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(JCloudSeverEurekaApplication.class, args);
    }

}
