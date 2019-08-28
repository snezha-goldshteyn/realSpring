package labs.intro.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

//@Setter
//@DeprecatedClass(newImplementation = T1000.class)
@Component
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String [] messages) {
        this.messages = Arrays.asList(messages);
    }

    @Override
    public void sayQuote() {
        for (String message : messages) {
            System.out.println(message);
        }
    }

    @PreDestroy
    public void killAll() {
        System.out.println("You all are terminated");
    }
}
