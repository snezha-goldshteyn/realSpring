package labs.intro.refresh_prototype_in_singleton;

import labs.intro.quoters.RandomUtil;
import org.springframework.context.annotation.*;

import java.awt.*;

import static labs.intro.quoters.RandomUtil.*;

@Configuration
@ComponentScan
//@ImportResource("classpath:color.xml")
public class Config {

    @Bean
    @Scope(value = "twoSeconds", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color() {
       return new Color(getRandomValue(0, 255), getRandomValue(0, 255), getRandomValue(0, 255));
    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(100);
        }
    }
}
