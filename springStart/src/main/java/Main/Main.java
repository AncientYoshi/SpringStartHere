package Main;

import Config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        int no = context.getBean(int.class);
        System.out.println(no);

    }
}
