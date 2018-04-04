package com.gao.servicefeign;

import com.gao.servicefeign.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/hiObj",method = RequestMethod.GET)
    public Person sayHiObj(@RequestParam Integer age,@RequestParam String name){
        final Person person = schedualServiceHi.sayHiObjFromClientOne(new Person(age,name));
        return person;
    }
}
