package org.asrs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//AOP , JPA(join point, Pointcut,Advise@Before/@After)-WTA(Weaving,@TargetObject,AOP Proxy)

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

@Service
class MyService{}

@Component
class MyComponent{

    @Bean A m(){

        return  new A();
    }

}

@Component
@Lazy
class A{
}



