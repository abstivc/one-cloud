package com.lad.song.one.file.service.impl;

import com.lad.song.one.file.dao.FileDao;
import com.lad.song.one.file.entity.FileDo;
import com.lad.song.one.common.common.Response;
import com.lad.song.one.file.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope//实现配置自动更新
public class FileServiceImpl implements FileService {

    private static final Logger logger  = LoggerFactory.getLogger(FileServiceImpl.class);

    @Autowired
    FileDao fileDao;

    @Value("${download.prefix:/}")
    String defaultDownloadPrefix;

    @Value("${time.connect-out}")
    String timeOut;

    @Override
    public Response queryFileById(String id) {
        FileDo fileDo = fileDao.queryFile(id, defaultDownloadPrefix);
        if (fileDo != null) {
            return new Response("000000", "查询失败", fileDo);
        } else {
            return new Response("000101", "资源不存在", timeOut);
        }
    }
}
