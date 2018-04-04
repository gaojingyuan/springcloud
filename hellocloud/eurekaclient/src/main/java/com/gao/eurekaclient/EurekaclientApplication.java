package com.gao.eurekaclient;

import com.gao.eurekaclient.vo.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class EurekaclientApplication {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @RequestMapping("/hiObj")
    @HystrixCommand(fallbackMethod = "hiObjError")
    // 此处注意 如果打断点 则会人为断路 走断路器方法
    public Person hiObj(@RequestBody Person p) {
        return new Person(p.getAge()+1,p.getName()+"n");
    }

    public Person hiObjError(@RequestBody Person p) {
        return new Person(20,"error");
    }

    @RequestMapping("/test")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }

}
