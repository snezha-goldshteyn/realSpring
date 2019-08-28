package labs.intro.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile(ProfilesConstants.PROD)
public class RepoImpl implements Repo {
    @Override
    public void crud() {
        System.out.println("saved to prod");
    }
}
