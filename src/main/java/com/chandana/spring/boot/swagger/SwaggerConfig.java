package com.chandana.spring.boot.swagger;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/api/javainuse.*"), regex("/api/hello.*"), regex("/api/list.*"));
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Chandana", "http://blog.napagoda.com", "cnapagoda@gmail.com");
        ApiInfo apiInfo = new ApiInfo(
                "My REST API",
                "Some custom description of API.",
                "API TOS",
                "Terms of service",
                contact,
                "License of API",
                "API license URL");
        return apiInfo;
    }

}