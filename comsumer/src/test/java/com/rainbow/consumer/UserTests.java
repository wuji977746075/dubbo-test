package com.rainbow.consumer;

import com.rainbow.common.service.TicketService;
import com.rainbow.consumer.service.UserServiceImpl;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserTests {

    @Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
        System.out.println(userService.buyTicket());
    }

    @Reference
    TicketService ticketService;
    @Test
    void contextLoadss() {
        System.out.println(ticketService.getTicket());
    }
}


