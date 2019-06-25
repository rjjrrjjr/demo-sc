package com.rj.controller;

import com.rj.model.Dept;
import com.rj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 14:25
 */
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/list")
    List<Dept> list(){
        return deptService.list();
    }

    @GetMapping("/get/{deptNo}")
    Dept getByDeptNo(@PathVariable(name = "deptNo") Long no){
        return deptService.getByDeptNo(no);
    }

    @PostMapping("/add")
    Boolean save(@RequestBody Dept dept){
        deptService.save(dept);
        return Boolean.TRUE;
    }
}
