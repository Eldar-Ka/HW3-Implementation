package Domain;

import DataAccess.AzureDB;
import DataAccess.UserDB;

public class Guest extends User{

    public Guest() {
    }

    public void login(String username, String password){
        /* 
        Search the DB for username, if exists - check password.
        If any is not true - return username/password incorrect. 
         */

        AzureDB db = UserDB.getInstance();
        // todo login
    }

    public void signUp(){
        /*
        Check that all fields are filled. adding to that, check availability of username
         */
    }



}
