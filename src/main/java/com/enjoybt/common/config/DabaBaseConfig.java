package com.enjoybt.common.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class DabaBaseConfig {

    @Value("${mybatis.mapper-location}")
    String mybatisMapperLocation;

    @Value("${mybatis.config-location}")
    private String mybatisConfigLocation;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactory getSqlSessionFactory() throws Exception
    {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource(mybatisConfigLocation));
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources(mybatisMapperLocation));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate getSqlSessionTemplate() throws Exception
    {
        return new SqlSessionTemplate(getSqlSessionFactory());
    }
}
