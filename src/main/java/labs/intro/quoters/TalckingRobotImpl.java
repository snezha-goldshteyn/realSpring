package labs.intro.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

//@Setter
@Component
public class TalckingRobotImpl implements TalckingRobot {
    @Autowired
    List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        for (Quoter quoter : quoters) {
            quoter.sayQuote();
        }
    }
}
