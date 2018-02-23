package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2018/2/13.
 */
@RestController
public class TestFeignController {

    @Autowired
    TestFeignServiceInterface testFeignServiceInterface;

    @RequestMapping(value = "/hiFeign",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return testFeignServiceInterface.sayHiFromClientOne(name);
    }
}
