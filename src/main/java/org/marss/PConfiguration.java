package org.marss;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class PConfiguration {

    public static void main(String[] args) {
        System.out.println("----------PSpring--------------");
        //AppConfig config= new AppConfig();
        //System.out.println(config.myBean());
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(AppConfig.class));
        MyBean myBean= applicationContext.getBean(MyBean.class);
        System.out.println(myBean);
        System.out.println(myBean.testMyBean());
        applicationContext.registerShutdownHook();



    }

}

//@Configuration(proxyBeanMethods = false)
@Configuration
class AppConfig{

    @Bean
    MyBean myBean(){

        return new MyBean();
    }


}

class MyBean{

    String testMyBean(){
        return "Hello testBean";
    }

}

/*@Configuration(proxyEnabled = false) // Lite mode, same effect as @Component
public class MyConfig {

    @Bean
    public ServiceA aService() {
        return new ServiceA();
    }

    @Autowired
    @Bean
    public ServiceB bService(ServiceA aServiceBean){
        return new ServiceB(aServiceBean);
    }

}*/