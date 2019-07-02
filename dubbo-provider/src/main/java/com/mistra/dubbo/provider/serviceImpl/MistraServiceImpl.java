package com.mistra.dubbo.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mistra.dubbo.api.MistraService;


@Service(version = "${mistra.service.version}")
public class MistraServiceImpl implements MistraService {

    @Override
    public String welcome(String name) {
        return "Hello" + name;
    }
}
