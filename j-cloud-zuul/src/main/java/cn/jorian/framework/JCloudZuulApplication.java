package cn.jorian.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //开启zuul代理
@EnableEurekaClient
public class JCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(JCloudZuulApplication.class, args);
    }

}
