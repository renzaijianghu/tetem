package com.totem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by haojianmeng on 2017/3/6.
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    public @ResponseBody String hello(){

        return "hello";
    }
}
