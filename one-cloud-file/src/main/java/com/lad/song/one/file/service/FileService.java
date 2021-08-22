package com.lad.song.one.file.service;

import com.lad.song.one.file.entity.FileDo;
import com.lad.song.one.common.common.Response;

public interface FileService {
    Response<FileDo> queryFileById(String id);
}
