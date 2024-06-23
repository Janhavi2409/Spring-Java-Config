package org.janhavi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private int age;

    @Autowired // field injection for Computer
    @Qualifier("desktop")
    private Computer com;
    public Alien() {
        System.out.println("Alien object created...");
    }

//    @Autowired // Constructor injection for Computer
//    public Alien(Computer com) {
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    //@Autowired  // Setter injection for Computer
    @Autowired
    @Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}
