package cn.cn.jorian.framework.controller;

import cn.cn.jorian.framework.feginservice.FeginClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:rionsoft
 * @description:
 * @author:zhangxiaokun
 * @create:2020/7/22 0022 下午 1:49
 **/
@RestController
public class HelloController {
    @Autowired
    private FeginClient feginClient;

    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){
        return feginClient.sayHello();
    }

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hi(){
        return feginClient.sayHi();
    }

    @GetMapping("/haha")
    @HystrixCommand(fallbackMethod = "hahaFallback")
    public String haha(){
        return feginClient.sayHaha();
    }


    public String helloFallback(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx";
    }

    public String hiFailBack(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hixxxx";
    }

    public String hahaFailBack(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hahaxxxx1";
    }


}
