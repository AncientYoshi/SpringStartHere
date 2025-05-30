package Config;

import model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class ProjectConfig {
    @Bean
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Ko KO");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Mg Mg");
        return p;
    }

    @Bean
    Parrot parrot3(){
        var p = new Parrot();
        p.setName("Nyi NYi");
        return p;
    }
}
