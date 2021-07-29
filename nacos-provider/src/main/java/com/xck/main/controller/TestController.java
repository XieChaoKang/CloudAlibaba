package com.xck.main.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RefreshScope
public class TestController {

    @Value("${name:xck}")
    private String name;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo(@RequestParam String str) {
        return "Hello Nacos Discovery " + str + " name: " + name;
    }

}
