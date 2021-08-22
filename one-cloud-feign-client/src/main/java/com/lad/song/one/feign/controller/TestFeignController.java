package com.lad.song.one.feign.controller;


import com.lad.song.one.common.common.Response;
import com.lad.song.one.feign.client.FileClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class TestFeignController {
    @Resource
    FileClient fileClient;

    @GetMapping(value = "/sub/feign/file/{id}")
    public Response geFile(@PathVariable("id") String id) {
        return fileClient.getFile(id);
    }
}
