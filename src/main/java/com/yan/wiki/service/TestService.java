package com.yan.wiki.service;

import com.yan.wiki.domain.Test;
import com.yan.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //使用Service注解，将这个Service交给Spring管理
public class TestService {

    @Autowired //把testmapper注入进来
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }

}
