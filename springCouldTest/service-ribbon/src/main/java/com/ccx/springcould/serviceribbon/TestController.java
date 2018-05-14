package com.ccx.springcould.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    HelloService service;

    @RequestMapping(value = "/hi")
    public  String hi(@RequestParam String name){
        return service.hiService(name);
    }
}
