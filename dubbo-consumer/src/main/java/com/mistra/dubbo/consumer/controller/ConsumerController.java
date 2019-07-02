package com.mistra.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mistra.dubbo.api.MistraService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerController {

    @Reference(version = "${mistra.service.version}")
    private MistraService mistraService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return mistraService.welcome(name);
    }
}
