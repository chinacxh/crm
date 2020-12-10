package com.hxzy.dao;

import com.hxzy.dto.PageDTO;
import com.hxzy.dto.RoleSearchDTO;
import com.hxzy.entity.Role;
import com.hxzy.vo.BootstrapTableVO;

import java.util.List;

/**
 * @author nick
 */
public interface RoleDao {

    BootstrapTableVO search(RoleSearchDTO pageDTO);

    int  insert(Role obj);

    int update(Role obj);

    int delete(String uuid);

    Role selectByPrimaryKey(String uuid);
}
