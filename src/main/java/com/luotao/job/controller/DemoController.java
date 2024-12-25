package com.luotao.job.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 处理客户端的HTTP请求，协调业务处理，根据请求返回数据
 */
//@Controller
@RestController // @RestController 是 @ResponseBody、@Controller 的组合注解
@ConfigurationProperties(prefix = "manager") //读取配置文件的属性注解,属性名需一致并通过setter注入
public class DemoController {
    private String name;
    private String hobby;
    public void setName(String name){
        this.name=name;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
//    public String getName(){
//        return this.name;
//    }
//    public String getHobby(){
//        return this.hobby;
//    }

    @GetMapping("get/userinfo")
    //@ResponseBody//将返回值作为响应体返回客户端
    public String getUserinfo(@RequestParam(value = "username",required = true) String nickname){
        return "昵称" + nickname;
    }

    @PostMapping("/login")
    //@ResponseBody
    public String login(){
        return "login success";
    }

    /**
     * @Description @ConfigurationProperties注解可读取配置文件属性值
     * http://127.0.0.1:8080/get/properties
     **/
    @GetMapping("/get/properties")
    public void getPropertiesValue(@Value("${server.port}") String port){
        System.out.println("================");
        System.out.println("port is " + port);
        System.out.println(name + hobby);
        System.out.println("================");
    }
}
