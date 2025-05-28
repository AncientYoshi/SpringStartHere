import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();
    }
}
