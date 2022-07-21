package com.yan.wiki.service;

import com.yan.wiki.domain.Ebook;
import com.yan.wiki.domain.EbookExample;
import com.yan.wiki.mapper.EbookMapper;
import com.yan.wiki.req.EbookReq;
import com.yan.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service //使用Service注解，将这个Service交给Spring管理
public class EbookService {

    @Resource //把ebookmapper注入进来
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ req.getName() + "%");
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebooksList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
