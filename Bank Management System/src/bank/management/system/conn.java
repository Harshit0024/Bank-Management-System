package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","8860746861");
            statement=connection.createStatement();

        }
        catch (Exception e){
            e.printStackTrace();

        }
    }


    public static void main(String[] args) {

    }
}
