package bank.management.system;
//*JDBC Connectivity steps*
//1. Register the driver
//2. Create Connection
//3. Create Statement
//4. Execute Query
//5. Close Connection

import java.sql.*;

public class Conn {

    Connection c;//2.
    Statement s;//3.

    public Conn() {
        try {
            //Class.forName(com.mysql.cj.jdbc.Driver);//1. no need this line for registrtion now java directly pick path
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Mah172@mysql");//2. 
            s = c.createStatement();//3.

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
