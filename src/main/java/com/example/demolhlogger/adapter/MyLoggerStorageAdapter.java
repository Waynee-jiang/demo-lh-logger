package com.example.demolhlogger.adapter;

import com.alibaba.fastjson.JSONObject;
import com.lhit.starter.logger.adapter.LhitLoggerStorageAdapter;
import com.lhit.starter.logger.entity.LhitLoggerEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyLoggerStorageAdapter implements LhitLoggerStorageAdapter {
    @Override
    public void storageLogger(LhitLoggerEntity lhitLoggerEntity) {
        //todo 这里是做简单的示例，真正项目中应该是存到mysql或者是其他DB中
        log.info("自定义的日志存储:{}", JSONObject.toJSONString(lhitLoggerEntity));
    }
}
