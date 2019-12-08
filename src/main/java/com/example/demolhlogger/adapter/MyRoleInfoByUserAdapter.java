package com.example.demolhlogger.adapter;

import com.example.demolhlogger.pojo.SysRole;
import com.example.demolhlogger.pojo.SysUser;
import com.lhit.starter.logger.adapter.LhitLoggerRoleInfoByUserAdapter;
import org.springframework.stereotype.Component;

@Component
public class MyRoleInfoByUserAdapter implements LhitLoggerRoleInfoByUserAdapter<SysRole, SysUser> {
    @Override
    public SysRole getRoleInfoByUserInfo(SysUser sysUser) {
        //todo 这里做演示 只是简单的返回一个角色信息，真正需要通过用户信息来确定用户对应的角色信息
        if (sysUser.getUserId() == 1)
            return SysRole.builder().name("用户1-系统角色").build();
        return SysRole.builder().name("默认-系统角色").build();
    }
}
