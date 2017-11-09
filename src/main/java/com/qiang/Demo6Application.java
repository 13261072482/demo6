
package com.qiang;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author guoyingqiang
 */
//@ServletComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Demo6Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }

    // 创建数据源
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource") // 指定数据源的前缀,在application.properties文件中指定
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }


}

