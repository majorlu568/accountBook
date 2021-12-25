package com.account.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(Environment environment){
        //设置swagger要显示的swagger的环境
        Profiles profile = Profiles.of("dev", "test");
        //判断当前是否处于该环境，通过enable()接收此参数是否要显示
        boolean isshow = environment.acceptsProfiles(profile);

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("createrRestApi")//配置分组
                .enable(isshow)//是否开启
                .select()//通过select()方法，去配置扫描接口
                //扫描的路径包，设置basePackage会将包下的所有被@Api标记类的所有方法作为api
                .apis(RequestHandlerSelectors.basePackage("com.account.account.controller"))
                .paths(PathSelectors.any())//指定路径处理，PathSelectors.any()代表所有的路径
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot中使用swagger3接口规范")//设置文档标题(API名称)
                .description("接口说明")//文档描述
                .termsOfServiceUrl("http://127.0.0.1:8080/")//服务条款URL
                .version("1.0.0")//版本号
                .build();
    }
}
