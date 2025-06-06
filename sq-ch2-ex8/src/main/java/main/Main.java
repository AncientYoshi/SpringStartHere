package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = new Parrot();
        p.setName("Lanny");

        Supplier<Parrot> parrotSupplier = () -> p;

        context.registerBean("parrot1",Parrot.class,parrotSupplier);

        Parrot x = context.getBean(Parrot.class);
        System.out.println(x.getName());


    }
}
