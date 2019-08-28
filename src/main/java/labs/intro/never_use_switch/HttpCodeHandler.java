package labs.intro.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;

public interface HttpCodeHandler {
//    @Autowired
//    default void registerMySelf(HttpCodeService service) {
//        service.register(type(), this);
//    }
    HttpCodeEnum type();
    void handle();
}
