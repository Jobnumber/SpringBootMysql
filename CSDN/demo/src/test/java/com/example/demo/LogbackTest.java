package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackTest {

   @Test
    public void test(){

       String name="root";
       String password="010126";
       log.debug("debug...");
       log.info("info...");
       log.info("name: {},password: {}",name,password);
       log.error("error...");
   }
}
