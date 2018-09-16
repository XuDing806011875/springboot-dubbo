package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * create by
 *
 * @author dingxu
 * @date 2018/9/15 17:03
 */
@Service
@Component
public class HelloImpl implements Hello {

    @Override
    public String sayHello() {
        return "say hello!!";
    }
}
