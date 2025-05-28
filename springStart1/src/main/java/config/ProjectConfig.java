package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Cho Chin");
        return p;
    }

    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Lambda");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Gamma");
        return p;
    }
}
