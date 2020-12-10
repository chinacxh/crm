package com.hxzy.controller;

import com.hxzy.dto.PageDTO;
import com.hxzy.dto.RoleSearchDTO;
import com.hxzy.entity.Role;
import com.hxzy.service.RoleService;
import com.hxzy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/** 以前的Servlet写法，现在变为最新的框架写法
 * @author nick
 */
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    //查询
    @GetMapping(value = "/api/role/data")
    public ResultVO search(RoleSearchDTO pageDTO){
       return this.roleService.search(pageDTO);
    }

    //查询
    @GetMapping(value = "/api/role/findone")
    public ResultVO findOne(String uuid){
        return this.roleService.selectByPrimaryKey(uuid);
    }

    @PostMapping(value = "/api/role/add")
    public ResultVO insert( Role role){
        return this.roleService.insert(role);
    }



}
