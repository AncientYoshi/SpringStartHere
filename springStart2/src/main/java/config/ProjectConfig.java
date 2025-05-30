package config;

import model.Parrot;
import org.springframework.context.annotation.Bean;

public class ProjectConfig {
    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Ko KO");
        return p;
    }

    @Bean(name = "Bro")
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Nyi Nyi");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Ko Hla");
        return p;
    }
}
