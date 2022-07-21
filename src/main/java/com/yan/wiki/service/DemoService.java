package com.yan.wiki.service;

import com.yan.wiki.domain.Demo;
import com.yan.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service //使用Service注解，将这个Service交给Spring管理
public class DemoService {

    @Resource //把demomapper注入进来
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }

}
