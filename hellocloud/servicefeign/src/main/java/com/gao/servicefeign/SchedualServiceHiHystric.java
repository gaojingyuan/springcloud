package com.gao.servicefeign;

import com.gao.servicefeign.vo.Person;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

    @Override
    public Person sayHiObjFromClientOne(Person p) {
        return new Person(1,"sorry "+p.getName());
    }
}