package electricitymanagment;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    conn() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", ""); // replace the password according to your account
            s = c.createStatement();
        } catch (Exception e) {
        }
    }
}
