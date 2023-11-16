package com.tarento.cellmark.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.tarento.cellmark.mapper", sqlSessionTemplateRef ="cropsSqlSessionTemplate")

public class MyBatisConfig {

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.crops")
    public DataSourceProperties getDatasourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean("cropsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.crops")
    public DataSource cropsDataSource() throws Exception {
        //return DataSourceBuilder.create().build();
        return DataSourceBuilder
                .create()
                .url("jdbc:sqlserver://;serverName=cus-crpd-sqldbsvr-01.database.windows.net;databaseName=cus-crpd-db01")
                .username("cropsdbdevuser")
                .password("JxixSS4VF$FVHi3Fvq4!")
                .driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver")
                .build();
    }

    @Primary
    @Bean(name = "cropsSqlSessionFactory")
    public SqlSessionFactory cropsSqlSessionFactory(@Qualifier("cropsDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        return factoryBean.getObject();
    }

    @Bean(name = "cropsSqlSessionTemplate")
    public SqlSessionTemplate cropsSqlSessionTemplate(
            @Qualifier("cropsSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
                sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
