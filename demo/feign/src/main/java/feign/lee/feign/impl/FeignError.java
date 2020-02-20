package feign.lee.feign.impl;

import feign.lee.entity.Student;
import feign.lee.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "当前服务器正在维护中。。。。。。";
    }
}
