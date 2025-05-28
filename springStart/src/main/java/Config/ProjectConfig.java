package Config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Myo ag");
        return p;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    int sayNo(){
        return 10;
    }

}
