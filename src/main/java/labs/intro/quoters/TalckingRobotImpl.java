package labs.intro.quoters;

import lombok.Setter;

import javax.annotation.PostConstruct;
import java.util.List;

@Setter
public class TalckingRobotImpl implements TalckingRobot {
    List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        for (Quoter quoter : quoters) {
            quoter.sayQuote();
        }
    }
}
