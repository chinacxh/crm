package com.hxzy.crm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class CrmApplicationTests {

    @Test
    void contextLoads() {

        String str=UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(str);
    }

}
