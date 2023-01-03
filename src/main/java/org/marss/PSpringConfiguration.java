package org.marss;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class PSpringConfiguration {

    public static void main(String[] args) {
        System.out.println("----------PSpring--------------");

        Config config= new Config();
        System.out.println(config.getA());

    }

}

@Configuration
class Config{

    @Bean
    A getA(){

        return new A();
    }


}