package labs.intro.never_use_switch;

import labs.intro.quoters.RandomUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

@Configuration
@ComponentScan
public class Config {

    @Bean
    public Map<HttpCodeEnum, HttpCodeHandler> initMap (List<HttpCodeHandler> handlers) {
        return handlers.stream().collect(toMap(HttpCodeHandler::type, h -> h));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        int code = RandomUtil.getRandomValue(100, 400);
        System.out.println(code);
        context.getBean(HttpCodeService.class).handleCode(code);
    }
}
