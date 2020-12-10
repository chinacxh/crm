package com.hxzy.controller;

import com.hxzy.service.UserService;
import com.hxzy.service.impl.UserServiceImpl;
import com.hxzy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nick
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/api/user/data")
    public ResultVO search(){
        return this.userService.search();
    }
}
