package com.example.mimifr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/equipment/list").setViewName("management");
        registry.addViewController("/rental/insert").setViewName("rentalpage");
        registry.addViewController("/login").setViewName("loginForm");
        registry.addViewController("/mypage").setViewName("mypage");

    }
}
