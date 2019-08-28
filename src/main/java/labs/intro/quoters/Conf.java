package labs.intro.quoters;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class Conf {

    @Bean
    public String str() {
        return "WTF!?";
    }
}
