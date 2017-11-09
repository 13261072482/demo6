package com.qiang.common;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author kingboy--KingBoyWorld@163.com
 * @date 2017/9/9 下午4:55
 * @desc 通用配置.
 */
@Configuration
public class CommonConfig {
    /*
     * 配置数据源
     */
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据源的属性
        setDruidProperties(dataSource);
        return dataSource;
    }

    //注入数据源配置信息
    @Resource
    DataSourceProperties config;

    //设置数据源的属性的方法
    private void setDruidProperties(DruidDataSource dataSource) {
        dataSource.setUrl(config.getUrl());
        dataSource.setUsername(config.getUsername());
        dataSource.setPassword(config.getPassword());
        dataSource.setDriverClassName(config.getDriverClassName());
        dataSource.setMaxActive(config.getMaxActive());
        dataSource.setInitialSize(config.getInitialSize());
        dataSource.setMinIdle(config.getMinIdle());
        dataSource.setMaxWait(config.getMaxWait());
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(config.getMaxPoolPreparedStatementPerConnectionSize());
        dataSource.setTimeBetweenEvictionRunsMillis(config.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(config.getMinEvictableIdleTimeMillis());
        dataSource.setPoolPreparedStatements(config.getPoolPreparedStatements());
        dataSource.setTestOnBorrow(true);
        dataSource.setValidationQuery("select 1");  //验证连接是否有效
        dataSource.setTestWhileIdle(false);
        dataSource.setTestOnReturn(false);
    }

  /*  *//**
     * 注册一个statViewServlet
     *//*
    @Bean
    public ServletRegistrationBean druidStatServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid*//*");
        //白名单
        servletRegistrationBean.addInitParameter("allow", "");
        //ip黑名单
        servletRegistrationBean.addInitParameter("deny", "192.168.1.73");
        //登录查看信息的账号密码.
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        //是否能够重置数据.
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    *//**
     * 注册一个：filterRegistrationBean
     *
     * @return
     *//*

    @Bean

    public FilterRegistrationBean druidStatFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        filterRegistrationBean.setFilter(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns("*//*");
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid*//*");
        return filterRegistrationBean;
    }*/
}
