package labs.intro.qualifiers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DaoService {
    @MyExampleRepo(DBType.MONGO)
    private Dao dao;

    @MyExampleRepo(DBType.ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 500)
    public void work() {
        dao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup() {
        backupDao.saveAll();
    }
}
