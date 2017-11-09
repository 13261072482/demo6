package com.qiang.common;/**
 * @author guoyingqiang
 * @date 2017/11/7.
 * @author maxrocky
 * @data 2017  07 11:17
 */

/**
 * @author maxrocky
 * @data 2017  07 11:17
 */


import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 *druid数据源状态监控.
 *@author Administrator
 *
 */

@WebServlet(urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = ""), // IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name = "deny", value = "192.168.1.73"), // IP黑名单 (存在共同时，deny优先于allow)
                @WebInitParam(name = "loginUsername", value = "admin"),
                @WebInitParam(name = "loginPassword", value = "123456"), //密码
                @WebInitParam(name = "resetEnable", value = "false")//禁用HTML页面上的“Reset All”功能
        }
)
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = 1L;

}