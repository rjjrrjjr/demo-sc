package com.rj.service;

import com.rj.model.Dept;

import java.util.List;

/**部门CRUD操作
 * @author ruanjin
 * @since 2019/5/10 11:48
 */
public interface DeptService {

    List<Dept> list();

    Dept getByDeptNo(Long deptNo);

    void save(Dept dept);
}
