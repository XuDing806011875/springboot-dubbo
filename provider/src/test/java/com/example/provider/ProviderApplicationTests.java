package com.example.provider;

import com.example.provider.service.Hello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {
    @Autowired
    Hello hello;
    @Test
    public void contextLoads() {
        String s = hello.sayHello();
        System.out.println(s);
    }

}
