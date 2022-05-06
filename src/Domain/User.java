package Domain;

public abstract class User {

    public User() {
    }

//    public void setName (String iName){
//        name=iName;
//    }
//    public void setEmail (String iEmail){
//        email=iEmail;
//    }
    public String searchDetails (String info) {return null;} //change to DB
    public String filter (FilterType filterType) {return null;} //maybe change to enum
}
