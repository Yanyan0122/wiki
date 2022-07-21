package com.yan.wiki.service;

import com.yan.wiki.domain.Ebook;
import com.yan.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service //使用Service注解，将这个Service交给Spring管理
public class EbookService {

    @Resource //把ebookmapper注入进来
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

}
