package com.swf.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author shiwenfeng
 * @date 2019-10-06 23:43
 **/
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
