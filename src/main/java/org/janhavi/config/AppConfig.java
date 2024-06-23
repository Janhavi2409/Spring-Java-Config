package org.janhavi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.janhavi")
public class AppConfig {
//    @Bean(name = {"dp1", "desktop", "atlas", "alex"})
//    Default name of a bean is method name. here, it is desktop
//    @Bean
//    @Primary
////    @Scope(value = "prototype") // value:- singleton(default), prototype
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
////    public Alien alien(@Qualifier("desktop") @Autowired Computer com) {
//    public Alien alien(@Autowired Computer com) {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
