package com.rj.service;

import com.rj.model.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ruanjin
 * @since 2019/5/15 16:57
 */
@Component
public class DeptClientServiceHystrix implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept getcbrnwyuemlwcryebwfbcfsfdsdsfsff(long id) {
                return new Dept().setDeptName("服务挂了，等会再请求");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
