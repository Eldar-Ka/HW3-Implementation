package Service;

import Domain.Game;

public class Main {


    public static void main(String[] args){
    LoginProcedure proc = new LoginProcedure();
    proc.RequestLogin("Naor","123456");
    RefereeRegister referee = new RefereeRegister();
    referee.RegisterReferee("tzadok","tzadok@walla","1");
    }

}
