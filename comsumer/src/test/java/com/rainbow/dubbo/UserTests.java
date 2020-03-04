package com.rainbow.dubbo;

import com.rainbow.dubbo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.buyTicket();
    }

}
