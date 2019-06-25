package com.rj.controller;

import com.rj.model.Dept;
import com.rj.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/14 20:39
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptFeignController {

    @Autowired
    DeptClientService deptClientService;

    @GetMapping("/list")
    List<Dept> list(){
        return deptClientService.list();
    }

    @GetMapping("/get/{deptId}")
    Dept get(@PathVariable Long deptId){
        return deptClientService.getcbrnwyuemlwcryebwfbcfsfdsdsfsff(deptId);
    }

    @PostMapping("/add")
    void add(@RequestBody Dept dept){
        deptClientService.add(dept);
    }
}
