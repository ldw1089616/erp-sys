package com.mini.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages="com.mini.mapper")
public class DatabaseConfig extends BasicDatabaseConfig {
}
