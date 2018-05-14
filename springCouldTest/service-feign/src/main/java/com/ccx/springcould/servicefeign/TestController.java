package com.ccx.springcould.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    SchedualServiceHi schedualServiceHi;


    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam String name){
        return  schedualServiceHi.sayHiFromClient(name);
    }

}
