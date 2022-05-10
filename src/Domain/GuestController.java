package Domain;
import DataAccess.AzureDB;

import java.util.ArrayList;

public class GuestController {

    public void RequestLogin(String username, String password) {
        AzureDB myDB = new AzureDB();
        String sql = "Select from Users where username=" + username + "and password=" + password;
//        ArrayList<ArrayList<String>> res = new ArrayList<>();
//        res = myDB.SelectAzureSQL(sql);
        ArrayList<ArrayList<String>> res = myDB.SelectAzureSQL(sql);

        if (res.size() == 0) {
            System.out.println("User Not exist");
        }
        System.out.println("Username : " + res.get(0).get(1) + "Connected");

        //        controller.RequestLogin(username, password);
//        guest.login(username, password);

        //todo login procedure

    }

}