package config;

import model.Parrot;
import model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Ko Ko");
        return p;
    }

    @Bean
    Person person(){
        var h = new Person();
        h.setName("Lu Me");
        return h;
    }

}
