package labs.intro.quoters;

import lombok.Setter;

@Setter
public class ShakeSpearQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
