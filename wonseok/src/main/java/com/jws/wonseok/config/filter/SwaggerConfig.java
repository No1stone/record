package com.jws.wonseok.config.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.*;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)//
//                .select()//
//                .apis(RequestHandlerSelectors.any())//
//                .paths(Predicate.not(PathSelectors.regex("/error")))//
//                .build()//
//                .apiInfo(metadata())//
//                .useDefaultResponseMessages(false)//
//                .securitySchemes(Collections.singletonList(apiKey()))
//                .securityContexts(Collections.singletonList(securityContext()))
//                .tags(new Tag("Account", "Operations about Account"))//
//                .genericModelSubstitutes(Optional.class);
//    }
//
//    private ApiInfo metadata() {
//        return new ApiInfoBuilder()//
//                .title("AWS Account Server API")//
//                .description("This is a Account API Server")
//                .version("1.0.0")//
//                .license("Sparwk License").licenseUrl("http://sparwk.com")//
//                .contact(new Contact(null, null, "jangws1003.ui@gmail.com"))//
//                .build();
//    }
//
//    private ApiKey apiKey() {
//        return new ApiKey("Authorization", "Authorization", "header");
//    }
//
//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.any())
//                .build();
//    }
//
//    private List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return Arrays.asList(new SecurityReference("Authorization", authorizationScopes));
//    }
}


