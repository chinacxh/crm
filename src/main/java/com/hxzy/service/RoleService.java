package com.hxzy.service;

import com.hxzy.dto.PageDTO;
import com.hxzy.dto.RoleSearchDTO;
import com.hxzy.entity.Role;
import com.hxzy.vo.ResultVO;

import java.util.List;

/**
 * @author nick
 */
public interface RoleService {

    ResultVO search(RoleSearchDTO pageDTO);

    ResultVO  insert(Role obj);

    ResultVO update(Role obj);

    ResultVO delete(String uuid);

    ResultVO selectByPrimaryKey(String uuid);
}
