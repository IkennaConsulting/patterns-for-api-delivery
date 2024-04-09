package com.museum.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.museum.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Redocly Museum API")
                                .description("Imaginary, but delightful Museum API for interacting with museum services and information. Built with love by Redocly.")
                                .termsOfService("https://redocly.com/subscription-agreement/")
                                .contact(
                                        new Contact()
                                                .url("https://redocly.com/docs/cli/")
                                                .email("team@redocly.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://opensource.org/license/mit/")
                                )
                                .version("1.1.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("MuseumPlaceholderAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                                )
                )
        ;
    }
}