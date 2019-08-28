package labs.intro.quoters;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Data
@Component
public class ShakeSpearQuoter implements Quoter {
    @Value("${shake}")
    private String message;
    @InjectRandomInt(min = 1, max = 5)
    private Integer repeat;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }

    }
}
