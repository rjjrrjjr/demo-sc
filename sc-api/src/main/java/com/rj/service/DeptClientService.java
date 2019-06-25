package com.rj.service;

import com.rj.model.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/14 20:33
 */
@RestController
@FeignClient(value = "PROVIDER-DEPT-SERVICE", fallbackFactory = DeptClientServiceHystrix.class)
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    Dept getcbrnwyuemlwcryebwfbcfsfdsdsfsff(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/addd")
    boolean add(Dept dept);
}
