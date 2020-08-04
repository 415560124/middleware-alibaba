package com.rhy.resourcegw.config.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.DefaultSink;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.StreamHttpLogWriter;
import org.zalando.logbook.json.JsonHttpLogFormatter;

/**
 * @author Rhy
 * @title 日志配置
 * @description logbook日志配置
 * @createTime 2020年07月16日 11:41:00
 * @modifier：Rhy
 * @modification_time：2020-07-16 11:41
 */
@Configuration
public class LogbookConfig {
    @Bean
    public Logbook logbook(){
        return Logbook.builder()
        /**
         * {@link JsonHttpLogFormatter}HTTP格式化方式
         * {@link StreamHttpLogWriter}日志写入级别
         */
        .sink(new DefaultSink(new JsonHttpLogFormatter(),
                new StreamHttpLogWriter(System.out)))
        .build();
    }
}
