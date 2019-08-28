package labs.intro.qualifiers;

import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

@MyExampleRepo(DBType.ORACLE)
public class OracleDao implements Dao {

    @SneakyThrows
    @Override
    public void saveAll() {
        Thread.sleep(5);
        System.out.println("Saved to oracle");
    }
}
