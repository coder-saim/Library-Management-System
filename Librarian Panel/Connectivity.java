package library.management.system;


import java.sql.*;

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
