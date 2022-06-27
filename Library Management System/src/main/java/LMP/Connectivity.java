package LMP;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectivity {
        Connection connection;
        Statement statement;
        public Connectivity(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection =DriverManager.getConnection("jdbc:mysql:///library_management_system","saim","Password123#@");
                statement =connection.createStatement();
            }

            catch(Exception e){
                System.out.println(e);
            }
        }
    }
