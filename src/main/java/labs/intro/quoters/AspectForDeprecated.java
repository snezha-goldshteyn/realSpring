package labs.intro.quoters;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectForDeprecated {

    @SneakyThrows
    @Around("execution( @DeprecatedClass  )")
    public void handleDeprecated(ProceedingJoinPoint jp) {
        System.out.println(jp.getTarget().getClass());
    }
}
