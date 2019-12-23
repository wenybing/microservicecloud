package com.wenyb.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * @Author wenyabing
 * @Date 2019/12/23 15:36
 */
@Configuration
public class DruidConfig {
    @Value("${spring.datasource.publicKey}")
    private String publicKey;

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("config");
        druidDataSource.setConnectionProperties("config.decrypt=true;config.decrypt.key=" + publicKey);
        return druidDataSource;
    }

}
