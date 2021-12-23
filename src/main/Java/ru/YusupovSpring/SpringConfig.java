package ru.YusupovSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("ru.YusupovSpring")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

}
