package labs.intro.profiles;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {
    private final Repo repo;

//    @Scheduled(fixedDelay = 1000)
    public void work() {
        repo.crud();
    }
}
