package com.lad.song.one.login.dao;

import com.lad.song.one.login.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    UserDo queryUser(UserDo userDo);
}
