package DataAccess;

public class GamesDB {
    private static AzureDB instance;

    public GamesDB() {
    }

    public static AzureDB getInstance(){
        return instance;
    }
}
