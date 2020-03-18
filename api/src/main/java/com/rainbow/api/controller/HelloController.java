package com.rainbow.api.controller;

import com.rainbow.common.model.User;
import com.rainbow.common.service.TicketService;
import io.swagger.annotations.*;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Api(value = "Hello服务",tags="首页接口")
public class HelloController {
    @Reference
    TicketService ticketService;

    @GetMapping(value = {"/","/hello"})
    @ResponseBody
    @ApiOperation("首页信息")
    public String index(
            @ApiParam(name="name",value = "名字",type = "String")
                    @RequestParam(required = false,defaultValue = "") String name
    ){
        String ticket = ticketService.getTicket();
        return name + "::"+ ticket;
    }


    @GetMapping("/user/{uid}")
//    @PostMapping("/user/{uid}")
    @ResponseBody
    @ApiOperation(value="用户查询",notes="用于查看具体用户信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功s"),
            @ApiResponse(code = 301, message = "fails")
    })
    public User user(
            @ApiParam(name="uid",value = "用户主键,多个英文,拼接",type="Integer")
            @PathVariable(required = false) Integer uid
    ){
//        String name = "sss";
        return new User();
    }
}
