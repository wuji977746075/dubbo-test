package com.rainbow.api;

import com.rainbow.common.service.TicketService;
import com.rainbow.common.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiTests {

    @Reference
    TicketService ticketService;

    @Test
    void contextLoads() {
        System.out.println(        ticketService.getTicket()        );
    }

}
