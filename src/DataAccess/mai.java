package DataAccess;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class mai {
    static public void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        AzureDB az = new AzureDB();
        String s = "Select * from Users";
        String s2 = "Insert into Users (USERNAME,PASSWORD,IMGURL) values ('naor','2131','http')";
        ArrayList<ArrayList<String> > rs = new ArrayList<>();
        rs = az.SelectAzureSQL(s);
        System.out.println(rs);
        az.ExecuteAzureSQL(s2);
    }
}
