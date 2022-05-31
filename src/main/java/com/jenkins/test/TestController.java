package com.jenkins.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2022/5/31 21:17
 *
 * @author ycl
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/user/{name}")
    public String testUser(@PathVariable("name") String name){
        return "my name is "+name+"!";
    }

}
