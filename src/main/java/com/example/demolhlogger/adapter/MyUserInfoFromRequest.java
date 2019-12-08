package com.example.demolhlogger.adapter;

import com.example.demolhlogger.pojo.SysUser;
import com.lhit.starter.logger.adapter.LhitLoggerUserInfoFromRequestAdapter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyUserInfoFromRequest implements LhitLoggerUserInfoFromRequestAdapter<SysUser> {
    @Override
    public SysUser getUserInfoFromRequest(HttpServletRequest httpServletRequest) {
        //todo 这里做演示 只是简单的返回一个用户信息 这里应该是通过request中的信息 获取到 真正对应的用户信息。
        return SysUser.builder().userId(1).username("user1").password("123456").build();
    }
}
