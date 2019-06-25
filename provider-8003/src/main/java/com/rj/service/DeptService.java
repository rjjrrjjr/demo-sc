package com.rj.service;

import com.rj.model.Dept;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 14:20
 */
public interface DeptService {
    List<Dept> list();

    Dept getByDeptNo(Long deptNo);

    void save(Dept dept);
}
