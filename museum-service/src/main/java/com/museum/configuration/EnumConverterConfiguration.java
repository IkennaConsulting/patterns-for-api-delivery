package com.museum.configuration;

import com.museum.model.TicketType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "com.museum.configuration.EnumConverterConfiguration.ticketTypeConverter")
    Converter<String, TicketType> ticketTypeConverter() {
        return new Converter<String, TicketType>() {
            @Override
            public TicketType convert(String source) {
                return TicketType.fromValue(source);
            }
        };
    }

}
