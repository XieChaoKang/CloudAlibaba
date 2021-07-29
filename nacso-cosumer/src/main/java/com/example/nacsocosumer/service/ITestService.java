package com.example.nacsocosumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "nacos-provider")
public interface ITestService {

    @RequestMapping(value = "/echo", produces = "text/plain; charset=UTF-8")
    String test(@RequestParam("str") String str);
}
