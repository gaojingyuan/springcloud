package com.gao.servicefeign;

import com.gao.servicefeign.vo.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-yuan",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    // @RequestParam(value = "name") String name 必须有value属性 否则启动报错
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hiObj", method = RequestMethod.GET)
    Person sayHiObjFromClientOne(@RequestBody Person p);
}

