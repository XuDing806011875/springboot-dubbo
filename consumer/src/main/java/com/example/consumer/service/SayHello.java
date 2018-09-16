package com.example.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.provider.service.Hello;
import org.springframework.stereotype.Service;

/**
 * create by
 *
 * @author dingxu
 * @date 2018/9/15 17:06
 */
@Service
public class SayHello {
    @Reference
    Hello hello;

    public void hello(){
        System.out.println(hello);
        String s = hello.sayHello();
        System.out.println(s);
    }
}
