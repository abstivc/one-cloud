package com.lad.song.one.login.service;

import com.lad.song.one.common.common.Response;
import com.lad.song.one.login.entity.UserDo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
    Response<UserDo> login(HttpServletRequest request, HttpServletResponse response, UserDo userDo);
}
