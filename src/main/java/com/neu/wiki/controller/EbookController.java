package com.neu.wiki.controller;

import com.neu.wiki.domain.Ebook;
import com.neu.wiki.req.EbookReq;
import com.neu.wiki.resp.CommonResp;
import com.neu.wiki.resp.EbookResp;
import com.neu.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);

        return resp;
    }
}
