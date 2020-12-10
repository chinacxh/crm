package com.hxzy.service.impl;

import com.hxzy.dao.RoleDao;
import com.hxzy.dto.PageDTO;
import com.hxzy.dto.RoleSearchDTO;
import com.hxzy.entity.Role;
import com.hxzy.service.RoleService;
import com.hxzy.vo.BootstrapTableVO;
import com.hxzy.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author nick
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    //框架自动帮我们管理类
    @Autowired
    private RoleDao roleDao;


    @Override
    public ResultVO search(RoleSearchDTO pageDTO) {
       BootstrapTableVO bootstrapTableVO=this.roleDao.search(pageDTO);

        ResultVO  resultVO=new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("OK");
        resultVO.setData(bootstrapTableVO);

        return resultVO;
    }

    @Override
    public ResultVO insert(Role obj) {
       int i=this.roleDao.insert(obj);

        ResultVO  resultVO=new ResultVO();
        if(i>0){
            resultVO.setCode(0);
            resultVO.setMessage("OK");
        }else{
            resultVO.setCode(500);
            resultVO.setMessage("新增数据失败");
        }

        return resultVO;
    }

    @Override
    public ResultVO update(Role obj) {
        int i=this.roleDao.update(obj);

        ResultVO  resultVO=new ResultVO();
        if(i>0){
            resultVO.setCode(0);
            resultVO.setMessage("OK");
        }else{
            resultVO.setCode(500);
            resultVO.setMessage("更新数据失败");
        }

        return resultVO;
    }

    @Override
    public ResultVO delete(String uuid) {
        int i=this.roleDao.delete(uuid);

        ResultVO  resultVO=new ResultVO();
        if(i>0){
            resultVO.setCode(0);
            resultVO.setMessage("OK");
        }else{
            resultVO.setCode(500);
            resultVO.setMessage("删除数据失败");
        }

        return resultVO;
    }

    @Override
    public ResultVO selectByPrimaryKey(String uuid) {
        Role role=this.roleDao.selectByPrimaryKey(uuid);

        ResultVO  resultVO=new ResultVO();
        if(role!=null){
            resultVO.setCode(0);
            resultVO.setMessage("OK");
            resultVO.setData(role);
        }else{
            resultVO.setCode(404);
            resultVO.setMessage("查询不到该记录");
        }

        return resultVO;
    }
}
