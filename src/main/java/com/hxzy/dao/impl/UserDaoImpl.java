package com.hxzy.dao.impl;

import com.hxzy.dao.UserDao;
import com.hxzy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nick
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> search() {
        String sql="select * from sys_user";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
