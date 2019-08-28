package labs.intro.quoters;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Book
public class ShakeSpearQuoter implements Quoter {
    @Value("${shake}")
    private String message;
    @InjectRandomInt(min = 3, max = 6)
    private Integer repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }

    }
}
