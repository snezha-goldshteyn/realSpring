package labs.intro.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ExampleConfig.class)
@ActiveProfiles(ProfilesConstants.PROD)
public class ExampleServiceTest {

    @Autowired
    private ExampleService exampleService;

    @Test
    public void work() {
        exampleService.work();
    }
}