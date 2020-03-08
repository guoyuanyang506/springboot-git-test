package com.example.springbootgittest.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    //1
    @RequestMapping("hhh")
    public String TestDemo() {
        return "dsfhksdjflkdk第三方看来都是借口附近";
    }

//2
    @RequestMapping("hhh")
    public String TestDemo1() {
        return "dsfhksdjflkdk第三方看来都是借口附近";
    }

}
