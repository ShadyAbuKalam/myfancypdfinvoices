package com.shatef.myfancyinvoices.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shatef.myfancyinvoices.ApplicationLauncher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackageClasses = ApplicationLauncher.class, basePackages = "com.shatef.myfancyinvoices")
@PropertySource("classpath:/application.properties")
@Configuration
public class MyFancyPdfInvoicesApplicationConfiguration {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
