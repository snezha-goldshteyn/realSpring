package labs.intro.never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class SuccessHttpCodeHandler implements HttpCodeHandler {
    @Override
    public HttpCodeEnum type() {
        return HttpCodeEnum.SUCCESS;
    }

    @Override
    public void handle() {
        System.out.println("success was handled...");
    }
}
