package com.example.consumer;

import com.example.consumer.service.SayHello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {
    @Autowired
    SayHello sayHello;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        sayHello.hello();
    }
}
