package com.demo.springbootquick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){

        return "hello springBoot quick";
    }
}
