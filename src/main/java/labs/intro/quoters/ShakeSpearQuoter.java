package labs.intro.quoters;

import lombok.Data;
import lombok.Setter;

@Data
public class ShakeSpearQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 0, max = 15)
    private Integer num;

    @Override
    public void sayQuote() {
        System.out.println(message + num);
    }
}
