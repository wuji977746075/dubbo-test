package com.rainbow.provider.service;

import com.rainbow.common.service.TicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TicketServiceTests {
    @Autowired
    private TicketService ticketService;

    @Test
    public void test(){
        System.out.print(ticketService.getTicket());
    }
}
