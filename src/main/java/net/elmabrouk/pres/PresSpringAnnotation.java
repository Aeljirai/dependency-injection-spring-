package net.elmabrouk.pres;

import net.elmabrouk.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("net.elmabrouk");
        IMetier metier = (IMetier)context.getBean(IMetier.class);
        System.out.println(metier.calculate());
    }
}
