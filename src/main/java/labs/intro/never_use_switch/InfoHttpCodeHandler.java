package labs.intro.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

@Component
//@Component("INFO")
public class InfoHttpCodeHandler implements HttpCodeHandler {

    @Override
    public HttpCodeEnum type() {
        return HttpCodeEnum.INFO;
    }

    @Override
    public void handle() {
        System.out.println("info was handled...");
    }
}
