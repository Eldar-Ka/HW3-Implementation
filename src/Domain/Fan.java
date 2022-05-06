package Domain;

import java.util.ArrayList;

public class Fan extends Member{

    private ArrayList<Compliant> Compliants;

    public Fan(String userName, String email, String password) {
        super(userName, email, password);
        this.Compliants = new ArrayList<Compliant>();
    }

    public void subscribe(PersonalPage page){
        /*
        add the fan to the personal page's subscribers
         */
    }

    public void gameAlert(Game game){
        /*
        set fan game alerts
         */
    }

    public void searchHistory(){
        /*
        display search history
         */
    }

    public void updateDetails(){
        /*

         */
    }

}
