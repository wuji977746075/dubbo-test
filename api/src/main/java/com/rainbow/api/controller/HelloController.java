package com.rainbow.api.controller;

import com.rainbow.common.model.User;
import com.rainbow.common.service.TicketService;
import io.swagger.annotations.*;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(value = "Hello服务",tags="首页接口")
public class HelloController {

//    @Reference
//    TicketService ticketService;

//    @RequestMapping("/error")
//    public String err(){
//        return "error has occur";
//    }

    @GetMapping(value = {"/","/hello"})
    @ApiOperation("首页信息")
    public String index(
            @ApiParam(name="name",value = "名字",type = "String") String name
    ){
        return "ticketService.getTicket()";
    }


    @PostMapping("/user/{id}")
    @ApiOperation(value="用户查询",notes="用于查看具体用户信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功s"),
            @ApiResponse(code = 301, message = "fails")
    })
    public User user(
            @ApiParam(name="uid",value = "用户主键,多个英文,拼接",type="Integer")
            @PathVariable(required = false) Integer uid
    ){
        String name = "sss";
        return new User();
    }
}
