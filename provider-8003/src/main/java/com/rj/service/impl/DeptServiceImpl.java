package com.rj.service.impl;

import com.rj.mapper.DeptMapper;
import com.rj.model.Dept;
import com.rj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 14:20
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public Dept getByDeptNo(Long deptNo) {
        return deptMapper.get(deptNo);
    }

    @Override
    public void save(Dept dept) {
        deptMapper.save(dept);
    }
}
