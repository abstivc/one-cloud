package com.lad.song.one.file.controller;

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
    public Response query(@PathVariable("id") String id) {
        return fileService.queryFileById(id);
    }


}
