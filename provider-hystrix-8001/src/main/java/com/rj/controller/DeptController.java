package com.rj.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rj.model.Dept;
import com.rj.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 11:53
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    Dept getByDeptNo(@PathVariable(name = "deptNo") Long no){
        if (no < 100){
            return deptService.getByDeptNo(no);
        }
        throw new RuntimeException("报个错玩玩");
    }

    Dept processHystrix_Get(@PathVariable(name = "deptNo")Long no){
        return new Dept().setDeptNo(no).setDeptName("no dept with deptNo equals " + no).setDbSource("no");
    }

    @PostMapping("/add")
    Boolean save(@RequestBody Dept dept){
        deptService.save(dept);
        return Boolean.TRUE;
    }
}
