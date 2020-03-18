package com.rainbow.provider.service;

import com.rainbow.common.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "=> a ticket ...";
    }
}
