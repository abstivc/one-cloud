package com.lad.song.one.login.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lad.song.one.common.common.Response;
import com.lad.song.one.login.entity.UserDo;
import com.lad.song.one.login.service.UserService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/login")
    public Response login(HttpServletRequest request, HttpServletResponse response, UserDo user) {
        return userService.login(request, response, user);
    }



}
