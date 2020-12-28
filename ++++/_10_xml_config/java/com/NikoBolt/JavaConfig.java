package com.NikoBolt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.NikoBolt")
public class JavaConfig {
/*
    @Bean
    public MessageProvider messageProvider() {
        return new SimpleMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider provider) {
        return new SimpleMessageRenderer(provider);
    }
*/
}
