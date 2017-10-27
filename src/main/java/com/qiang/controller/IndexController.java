package com.qiang.controller;/**
 * Created by maxrocky on 2017/10/27.
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 27 8:57
 */
@RestController
@Api(value = "默认模块")
public class IndexController {
    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    @ApiModelProperty(value = "访问模块")
    public String index() {
        return "<html>"
                + "<head><title>模块</title></head>"
                + "<body>"
                + "<h1 style='text-align: center;margin: 100px;padding: 50px;background-color: lightskyblue;'>"
                + "欢迎访问shangp 模块!"
                + "</h1>"
                + "</body>"
                + "</html>";
    }
}
