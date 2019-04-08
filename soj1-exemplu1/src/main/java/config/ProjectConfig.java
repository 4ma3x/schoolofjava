package config;

import objects.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {
    @Bean
    //vo fi aceeasi referinta
    //@Scope("prototype")
    public Cat cat() {
        Cat c = new Cat();
        c.name = "tom";
        return c;
    }

}
