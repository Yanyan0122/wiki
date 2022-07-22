package com.yan.wiki.service;

import com.yan.wiki.domain.Ebook;
import com.yan.wiki.domain.EbookExample;
import com.yan.wiki.mapper.EbookMapper;
import com.yan.wiki.req.EbookReq;
import com.yan.wiki.resp.EbookResp;
import com.yan.wiki.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service //使用Service注解，将这个Service交给Spring管理
public class EbookService {

    @Resource //把ebookmapper注入进来
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+ req.getName() + "%");//模糊查询
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebooksList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook, ebookResp);
//            // 对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//
//            respList.add(ebookResp);
//        }

        //列表复制
        List<EbookResp> list = CopyUtil.copyList(ebooksList, EbookResp.class); //上面一段相当于这一行

        return list;
    }
}
