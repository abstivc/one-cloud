package com.lad.song.one.feign.fallback;

import com.lad.song.one.common.common.Response;
import com.lad.song.one.feign.client.FileClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 熔断 服务降级
 */
public class FileClientFallback implements FallbackFactory<FileClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileClientFallback.class);

    @Override
    public FileClient create(Throwable throwable) {
        return new FileClient() {
            @Override
            public Response getFile(String bookId) {
                LOGGER.error("获取getFile[{}]失败：{}", bookId, throwable.getMessage());
                return new Response("000101", "无服务提供");
            }
        };
    }
}
