package DataAccess;

public class UserDB {
    private static AzureDB instance;

    public UserDB() {
    }

    public static AzureDB getInstance(){
        return instance;
    }
}
