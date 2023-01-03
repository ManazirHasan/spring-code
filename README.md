# spring-code
@Configuration:  All method marked with @Bean will be wrapped into CGLIB wrapper,
which works as if its the first call of this method, then the original methods's body will be executed.
