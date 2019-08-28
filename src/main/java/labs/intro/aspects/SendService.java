package labs.intro.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendService {
    public void throwException() {
        System.out.println("ex has thrown");
        throw new DatabaseRuntimeException();
    }
}
