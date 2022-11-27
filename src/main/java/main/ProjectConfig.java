package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

//    @Bean("miki")
    @Bean
    @Primary
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
