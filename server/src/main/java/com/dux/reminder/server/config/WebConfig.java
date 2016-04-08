package com.dux.reminder.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by DUX on 08.04.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.dux.reminder.server")
public class WebConfig extends WebMvcConfigurerAdapter{

}
