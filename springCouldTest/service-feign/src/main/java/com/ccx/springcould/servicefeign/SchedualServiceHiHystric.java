package com.ccx.springcould.servicefeign;


import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClient(String name) {
        return "sorry,"+name;
    }
}
