package labs.intro;

import labs.intro.quoters.ShakeSpearQuoter;
import labs.intro.quoters.TalckingRobot;
import labs.intro.quoters.TerminatorQuoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IntroApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean(TalckingRobot.class);
    }

}
