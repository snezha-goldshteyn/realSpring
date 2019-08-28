package labs.intro.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HttpCodeService {
//    private Map<HttpCodeEnum, HttpCodeHandler> map = new HashMap<>();

    @Autowired
    Map<HttpCodeEnum, HttpCodeHandler> map;

//    public void register(HttpCodeEnum codeEnum, HttpCodeHandler handler) {
//        if (map.containsKey(codeEnum)) {
//            throw new IllegalStateException(codeEnum.toString() + " already in use");
//        }
//        map.put(codeEnum, handler);
//    }

    public void handleCode(int code) {
        HttpCodeEnum codeEnum = HttpCodeEnum.findByHttpCode(code);
        map.get(codeEnum).handle();
    }

}
