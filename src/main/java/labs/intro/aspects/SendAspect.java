package labs.intro.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class SendAspect {
    private List<String> emails;

    @Value("${emails}")
    public void setEmails(String [] messages) {
        this.emails = new ArrayList<>(Arrays.asList(messages));
    }

    @AfterThrowing(pointcut = "execution(* labs.intro.aspects.SendService.*(..))", throwing="ex")
    public void SendEmailAfterThrowingAllMethods(RuntimeException ex) {
        for (String email : emails) {
            System.out.println("Send email to " + email + "with exception " + ex);
        }
    }
}
