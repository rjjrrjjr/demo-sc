package com.rj.mapper;

import com.rj.model.Dept;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 10:42
 */
public interface DeptMapper {

    //列表
    List<Dept> list();

    //主键查询
    Dept get(Long deptNo);

    //新增
    void save(Dept dept);
}
