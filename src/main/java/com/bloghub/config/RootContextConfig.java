package com.bloghub.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class RootContextConfig {

//    @Bean
//    @Qualifier("HikariConfig")
//    @ConfigurationProperties(prefix="spring.datasource.hikari")
//    public HikariConfig HikariConfig() {
//        return new HikariConfig();
//    }
//
//    @Bean
//    @Qualifier("DataSource")
//    public DataSource primaryDataSource() throws Exception {
//        return new HikariDataSource(HikariConfig());
//    }
//
//    @Bean(name = "SqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(
//            @Qualifier("DataSource") DataSource dataSource,
//            ApplicationContext applicationContext) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/*.xml"));
//
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean(name = "SqlSessionTemplate")
//    public SqlSessionTemplate sqlSessionTemplate(
//            @Qualifier("SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
    
}
