package com.NikoBolt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean
    public MessageProvider messageProvider() {
        return new SimpleMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider provider) {
        return new SimpleMessageRenderer(provider);
    }
}
