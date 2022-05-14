package DataAccess;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class AzureDB {

    String cnnString;

    public AzureDB(){

        String user = "";
        String password = "123456T!";
        cnnString ="jdbc:sqlserver://tzevethazak.database.windows.net:1433;database=DB_HW3_Implementation;user=tzevethazak@tzevethazak;password=123456T!;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

    }


    /**
     * @param sql "select * from ...
     * @return ArrayList for ArrayList each index is row, each row is arraylist of string that each index is column
     * for example select  * from users   users =  id,name,pass,url
     * return [[1,123123,naor,http],[2,41234,ido,http]] for 2 rows in the table
     */
    public ArrayList<ArrayList<String>> SelectAzureSQL(String sql) {
        System.out.println("Select data : ");
        ResultSet resultSet = null;
        ArrayList<ArrayList<String>> ret = new ArrayList<>();

        try (Connection cnn = DriverManager.getConnection(cnnString);
             Statement statement = cnn.createStatement();) {
            resultSet = statement.executeQuery(sql);
            int col = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                ArrayList<String> res = new ArrayList<>();
                for(int i = 1;i <=col; i++){
                    res.add(resultSet.getString(i));
                }
                ret.add(res);
            }
            return ret;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param sql query to modify table in DB
     */
    public boolean ExecuteAzureSQL(String sql){
        try(Connection cnn = DriverManager.getConnection(cnnString);
            PreparedStatement statement = cnn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);) {
            ResultSet resultSet = null;
            statement.execute();
            resultSet = statement.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("Keys" + resultSet.getString(1));
            }
            return true;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

}
