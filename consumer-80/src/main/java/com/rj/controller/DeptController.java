package com.rj.controller;

import com.rj.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/10 14:39
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    //private static final String prefix = "http://localhost:8001";
    private static final String prefix = "http://PROVIDER-DEPT-SERVICE";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/list")
    List<Dept> list(){
        return restTemplate.getForObject(prefix + "/dept/list", List.class);
    }

    @GetMapping("/get/{deptNo}")
    Dept getByDeptNo(@PathVariable Long deptNo){
        return restTemplate.getForObject(prefix + "/dept/get/" + deptNo, Dept.class);
    }

    @PostMapping("/add")
    Boolean save(@RequestBody Dept dept){
        return restTemplate.postForObject(prefix + "/dept/add", dept, Boolean.class);
    }
}
