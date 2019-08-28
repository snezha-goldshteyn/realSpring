package labs.intro.never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class HttpCodeService {

    @Autowired
    Map<HttpCodeEnum, HttpCodeHandler> map;

    public void handleCode(int code) {
        HttpCodeEnum codeEnum = HttpCodeEnum.findByHttpCode(code);
        map.get(codeEnum).handle();
    }

}
