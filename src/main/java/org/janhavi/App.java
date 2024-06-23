package org.janhavi;

import org.janhavi.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop desktop = context.getBean("dp1", Desktop.class);
        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();

        Laptop laptop = context.getBean(Laptop.class);
        laptop.compile();
    }
}
