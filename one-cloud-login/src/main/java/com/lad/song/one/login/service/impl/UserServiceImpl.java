package com.lad.song.one.login.service.impl;

import com.lad.song.one.common.common.Response;
import com.lad.song.one.login.dao.UserDao;
import com.lad.song.one.login.entity.UserDo;
import com.lad.song.one.login.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
@RefreshScope//实现配置自动更新
public class UserServiceImpl implements UserService {

    private static final Logger logger  = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;


    @Override
    public Response<UserDo> login(HttpServletRequest request, HttpServletResponse response, UserDo userDo) {
        UserDo userBase = userDao.queryUser(userDo);
        return new Response<UserDo>("000000", "查询成功", userBase);
    }
}
