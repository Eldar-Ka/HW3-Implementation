package Domain;
import DataAccess.AzureDB;

import java.util.ArrayList;

public class GuestController {

    public boolean RequestLogin(String username, String password) {
        AzureDB myDB = new AzureDB();
        String sql = "Select username,email from Users where username="+"'"+username+"'"+" and"+" password="+"'"+password+"'";
        ArrayList<ArrayList<String>> res = myDB.SelectAzureSQL(sql);

        if (res.isEmpty() ) {
            System.out.println("User Does Not Exist or Password is Wrong");
            return false;
        }
        else {
            System.out.println(res);
            System.out.println("Username : " + res.get(0).get(0) + " Email: " + res.get(0).get(1) + " Connected");
            return true;
        }

    }

}