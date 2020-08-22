package calculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DateSqlCalc {
	private final static String url = "jdbc:postgresql://localhost/test";
    private final static String user = "postgres";
    private final static String password = "mithun";

    public static Date_input addDateSql(Date_input dt1, int n)
    {
    	Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                //System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
                
            }
            
            String str = "SELECT date "+ "'" +DisplayDate.convertSQL(dt1)+ "'" + " + integer " +  "'"+n + "'";
            //System.out.println(str);
            MemoryManagment.memoryWrite(n +"days added to " + DisplayDate.convertSQL(dt1));
            PreparedStatement pst = conn.prepareStatement(str);
            ResultSet rs = pst.executeQuery();
        while (rs.next()) {
           // System.out.println(rs.getString(1));
            dt1 = DisplayDate.convert2dt(rs.getString(1));
           
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
		return dt1;
    	
    }
    public static int diffDateSql(Date_input dt1, Date_input dt2)
    {
    	//date '2001-10-01' - date '2001-09-28'
    	int n = 0;
    	Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
               // System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
                
            }
            
            String str = "SELECT date "+ "'" +DisplayDate.convertSQL(dt1)+ "' - date '" +  DisplayDate.convertSQL(dt2) +"'";
            //System.out.println(str);
            MemoryManagment.memoryWrite("Days between " + DisplayDate.convertSQL(dt1) + " & " + DisplayDate.convertSQL(dt2) );
            PreparedStatement pst = conn.prepareStatement(str);
            ResultSet rs = pst.executeQuery();
        while (rs.next()) {
           // System.out.println(rs.getString(1));
            n = Integer.parseInt(rs.getString(1));
           
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    	return n;
    }
}
