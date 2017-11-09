
package com.qiang.common;


/**
 * @author guoyingqiang
 * @date 2017/11/7.
 */

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * druid 配置.
 * <p>
 * <p>
 * <p>
 * 这样的方式不需要添加注解：@ServletComponentScan
 *
 * @author Administrator
 */

@Configuration

public class DruidConfiguration {


    /**
     * 注册一个StatViewServlet
     *
     * @return
     */

    @Bean

    public ServletRegistrationBean druidStatViewServle2() {

        //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");


        //添加初始化参数：initParams


        //白名单：

        servletRegistrationBean.addInitParameter("allow", "");

        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.

        servletRegistrationBean.addInitParameter("deny", "192.168.1.73");

        //登录查看信息的账号密码.

        servletRegistrationBean.addInitParameter("loginUsername", "admin");

        servletRegistrationBean.addInitParameter("loginPassword", "123456");

        //是否能够重置数据.

        servletRegistrationBean.addInitParameter("resetEnable", "false");

        return servletRegistrationBean;

    }


    /**
     * 注册一个：filterRegistrationBean
     *
     * @return
     */

    @Bean

    public FilterRegistrationBean druidStatFilter2() {


        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

        filterRegistrationBean.setName("druidWebStatFilter");
        //添加过滤规则.

        filterRegistrationBean.addUrlPatterns("/*");


        //添加不需要忽略的格式信息.

        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

        return filterRegistrationBean;

    }
  /*  // 创建SqlSessionFactory
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/dao*//*"));
        return sqlSessionFactoryBean.getObject();
    }

    // 创建事物管理器
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    *//*
     * 配置数据源
     *//*
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
    }*/
}

