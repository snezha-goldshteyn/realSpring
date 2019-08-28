package labs.intro.quoters;

import org.springframework.stereotype.Component;

@Film
public class T1000 extends TerminatorQuoter {
    @Override
    public void sayQuote() {
        System.out.println("Where is John Connor?");
    }
}
