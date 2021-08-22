package com.lad.song.one.file.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lad.song.one.common.common.Response;
import com.lad.song.one.file.service.FileService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/file")
@RefreshScope
public class FileController {

    @Resource
    private FileService fileService;

    @GetMapping(value = "/query/{id}")
    @SentinelResource(value = "file_query",blockHandler = "dealFileQuery")
    public Response query(@PathVariable("id") String id) {
        return fileService.queryFileById(id);
    }

    public Response dealFileQuery(String id, BlockException exception) {
        return new Response("990101", id + "-> 访问人数过多啦!");
    }


}
