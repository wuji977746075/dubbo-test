package com.rainbow.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SPRING_WEB).groupName("docket2");
    }

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_12).groupName("docket1");
    }

    @Bean
    public Docket docket(Environment env){
        Profiles profiles = Profiles.of("dev","test");
        Boolean flag = env.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("rainbow")
                .enable(flag)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.rainbow.api"))
//                .apis(RequestHandlerSelectors.withClassAnnotation(HelloController.class))
//                .apis(RequestHandlerSelectors.withMethodAnnotation(GetMapping.class))
//                .paths(PathSelectors.xxx)
                .build();
    }

    private ApiInfo apiInfo(){
        // 作者
        Contact contact = new Contact("", "", "");
        return new ApiInfo(
                "Api Documentation 22",
                "Api Documentation",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
