package cn.jorian.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:rionsoft
 * @description:
 * @author:zhangxiaokun
 * @create:2020/7/22 0022 上午 10:50
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider 2 ,Hello consumer!";
    }
    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider 2 ,Hi consumer!";
    }
    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider 2 ,Haha consumer!";
    }

}
