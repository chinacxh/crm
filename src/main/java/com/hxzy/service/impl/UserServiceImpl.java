package com.hxzy.service.impl;

import com.hxzy.dao.UserDao;
import com.hxzy.entity.User;
import com.hxzy.service.UserService;
import com.hxzy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nick
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public ResultVO search() {
        List<User> arr=this.userDao.search();

        ResultVO vo=new ResultVO();
        vo.setCode(0);
        vo.setMessage("OK");
        vo.setData(arr);
        return vo;
    }
}
