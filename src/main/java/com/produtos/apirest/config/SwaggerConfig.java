package com.produtos.apirest.config;

import com.google.common.base.Predicate;
import io.swagger.annotations.Contact;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2


public class SwaggerConfig{
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
		.paths(regex("/api.*"))
		.build()
		.apiInfo(metaInfo());
		
	}
	
private ApiInfo metaInfo() {
	ApiInfo apiInfo = new ApiInfo(
			"Produtos API REST",
			"API REST de cadastro de produtos. ",
			"1.0",
			"Terms of Service",
			new Contact ("Michelli Brito" ) {
            @Override
            public String name() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String url() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String email() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Class<? extends Annotation> annotationType() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        },
			"Apache Licence Version 2.0",
			new ArrayList<VendorExtension>()
			
     };			
    
	return apiInfo;

    private Predicate<String> regex(String api) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
	


