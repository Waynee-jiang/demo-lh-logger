package com.example.demolhlogger.controller;

import com.example.demolhlogger.pojo.SysUser;
import com.google.common.collect.Lists;
import com.lhit.starter.logger.annotation.LhitLogger;
import com.lhit.starter.logger.entity.LoggerBusinessType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController

public class UserController {

    private List<SysUser> userList = Lists.newArrayList(
            SysUser.builder().userId(1).username("user1").password("123456").build(),
            SysUser.builder().userId(2).username("user2").password("123456").build(),
            SysUser.builder().userId(3).username("user3").password("123456").build(),
            SysUser.builder().userId(4).username("user4").password("123456").build(),
            SysUser.builder().userId(5).username("user5").password("123456").build()
    );

    @LhitLogger(title = "查询用户", businessType = LoggerBusinessType.QUERY)
    @GetMapping("/user/query")
    public ResponseEntity<List<SysUser>> selectAllUser() {
        return ResponseEntity.ok(userList);
    }

    @LhitLogger(title = "添加用户", businessType = LoggerBusinessType.INSERT,isSaveRequestData = true,isSaveOperNetAddr = true,isSaveOperRoleInfo = true,isSaveOperUserInfo = true,isSaveReturnData = true)
    @PostMapping("/user/insert/{key1}")
    public ResponseEntity addAllUser(@RequestBody SysUser sysUser, @PathVariable String key1, @RequestParam(value = "key2") String key2) {
        log.info("UserController key1:{}",key1);
        log.info("UserController key2:{}",key2);
        log.info("UserController sysUser:{}",sysUser);
        userList.add(sysUser);
        return ResponseEntity.ok("添加成功");
    }


}
