package labs.intro.aspects;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
@PropertySource("classpath:application.properties")
public class Config {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SendService bean = context.getBean(SendService.class);
        try {
            bean.throwException();
        } catch (Exception e) {
            System.out.println("We are solving problem");
        }
    }
}
