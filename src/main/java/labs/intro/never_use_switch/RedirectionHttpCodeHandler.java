package labs.intro.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
//@Component("REDIRECTION")
public class RedirectionHttpCodeHandler implements HttpCodeHandler {
    @Override
    public HttpCodeEnum type() {
        return HttpCodeEnum.REDIRECTION;
    }

    @Override
    public void handle() {
        System.out.println("redirection was handled...");
    }
}
