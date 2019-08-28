package labs.intro.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@DeprecatedClass(newImplementation = T1000.class)

@Film
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    @Autowired
    private String string;

    @PostConstruct
    public void addStringToList() {
        messages.add(string);
    }

    @Value("${terminator}")
    public void setMessages(String [] messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
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
