package com.qiang.common;
/**
 * Created by maxrocky on 2017/10/26.
 */


import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author maxrocky
 * @data 2017 guoyingqiang 26 14:49
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qiang.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("商品模块")
                .description("商品模块文档示例")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();

    }
}
