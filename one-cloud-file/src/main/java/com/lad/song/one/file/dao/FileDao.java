package com.lad.song.one.file.dao;

import com.lad.song.one.file.entity.FileDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FileDao {
    int saveFile(FileDo fileDo);

    FileDo queryFile(@Param("fileId") String fileId, @Param("downloadPrefix") String downloadPrefix);

    List<FileDo> queryFileList(@Param("name") String name, @Param("downloadPrefix") String downloadPrefix);

}
