package com.lad.song.one.feign.client;

import com.lad.song.one.common.common.Response;
import com.lad.song.one.feign.fallback.FileClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(contextId = "file", name="one-cloud-file", fallbackFactory = FileClientFallback.class, value = "one-cloud-file")
public interface FileClient {
    @RequestMapping("/one-cloud-file/file/query/{id}")
    public Response getFile(@PathVariable("id") String id);
}
