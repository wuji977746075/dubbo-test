package com.rainbow.consumer.service;

import com.rainbow.common.service.TicketService;
import com.rainbow.common.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTests {
    @Autowired
    UserService userService;
    @Test
    public void testUser() {
        System.out.println(userService.buyTicket());
    }

    @Reference
    TicketService ticketService;
    @Test
    public void testTicket() {
        System.out.println(ticketService.getTicket());
    }
}
