package com.mini.framework.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.DefaultResourceLoader;

import javax.sql.DataSource;

/**
 * Created by pactera on 2017/1/6.
 */
public class BasicDatabaseConfig {
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setConfigLocation(new DefaultResourceLoader().getResource("classpath:/mybatis/mybatis-config.xml"));
        return sessionFactory.getObject();
    }
}
