package com.qiang.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author kingboy
 * @date 2017/6/19 下午5:15
 * @desc configuration的数据池属性
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
@Component
public class DataSourceProperties {

    private String url;

    private String username;

    private String password;

    private String driverClassName;

    private Integer maxActive;

    private Integer initialSize;

    private Integer minIdle;

    private Integer maxWait;

    private Integer maxPoolPreparedStatementPerConnectionSize;

    private Integer timeBetweenEvictionRunsMillis;

    private Integer minEvictableIdleTimeMillis;

    private Boolean poolPreparedStatements;

}
