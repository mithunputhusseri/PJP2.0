package calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemoryManagment {
	private final static String url = "jdbc:postgresql://localhost/postgres";
    private final static String user = "postgres";
    private final static String password = "mithun";
    public static void memoryWrite(String str)
    {
    	Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
               // System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
                
            }
            String str1 = "INSERT INTO memory (command) VALUES('" +str+   "')" ;
           // System.out.println(str1);
            PreparedStatement pst = conn.prepareStatement(str1 );
            pst.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	
    }
    public static void memoryRead()
    {
    	Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
              //  System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
                
            }
            
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM memory");
            ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1));
           
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
