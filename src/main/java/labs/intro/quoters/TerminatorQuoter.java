package labs.intro.quoters;

import lombok.Setter;

import java.util.List;

@Setter
public class TerminatorQuoter implements Quoter {
    private List<String> messages = List.of("a", "b");

    @Override
    public void sayQuote() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
