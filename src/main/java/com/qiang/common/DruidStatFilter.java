package com.qiang.common;/**
 * @author guoyingqiang
 * @date 2017/11/7.
 * @author maxrocky
 * @data 2017  07 11:19
 * <p>
 * druid过滤器.
 * @author Administrator
 */

/**
 * @author maxrocky
 * @data 2017  07 11:19
 */
/**
 *druid过滤器.
 *@author Administrator
 *
 */

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
        }
)
public class DruidStatFilter extends WebStatFilter {

        }