package com.rainbow.consumer.service;

import com.rainbow.common.service.TicketService;
import com.rainbow.common.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Reference
    TicketService ticketService;

    public String buyTicket() {
        String ticket = ticketService.getTicket();
        System.out.println("getTicket => "+ ticket);
        return "get ticket : "+ticket;
    }
}
