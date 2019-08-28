package labs.intro.qualifiers;

@MyExampleRepo(DBType.MONGO)
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Saved to Mongo");
    }
}
