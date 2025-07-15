package com.service.congig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig1.class, AppConfig2.class})
public class AppConfig {

}
