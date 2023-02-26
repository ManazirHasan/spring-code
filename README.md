# spring-code
https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html

@Configuration:  any method marked as @Bean is wrapped under CGLIB wrapper,
which works as if its the first call of this method, then the original methods's body will be executed.

@Configuration Indicates that a class declares one or more @Bean methods and 
may be processed by the Spring container to generate bean definitions and 
service requests for those beans at runtime.

@Configuration is meta-annotated with @Component,
therefore @Configuration classes are candidates for component scanning.


@Component indicates that classes are considered as candidates for component scanning 
and it auto-detection 
when using annotation-based configuration and classpath scanning.
@Component - we cannot autowire (@Autowired) any class if it is not marked with @Component. It means 
when you want to autowire any class using annotation that class should be annotated with @Component.




