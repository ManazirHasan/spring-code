package org.marss;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class PSpringComponent {

    public static void main(String[] args) {
        System.out.println("-------Component---------");

        PComponent pComponent = new PComponent();
        System.out.println(pComponent.getA());
        System.out.println(pComponent.getB());
    }
}

@Component
class PComponent{

    @Bean
    A getA(){

        return new A();
    }
    @Bean
    B getB(){
        return  new B();
    }

    @Bean
    D getC(){

        return new D();
    }

}

