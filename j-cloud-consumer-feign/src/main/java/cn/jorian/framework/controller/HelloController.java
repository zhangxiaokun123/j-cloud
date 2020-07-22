package cn.jorian.framework.controller;

import cn.jorian.framework.feginservice.FeginClient;
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
    public String hello(){
        return feginClient.sayHello();
    }

    @GetMapping("/hi")
    public String hi(){
        return feginClient.sayHi();
    }

    @GetMapping("/haha")
    public String haha(){
        return feginClient.sayHaha();
    }


}
