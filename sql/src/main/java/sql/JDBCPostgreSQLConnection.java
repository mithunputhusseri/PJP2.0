package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCPostgreSQLConnection {
    private final String url = "jdbc:postgresql://localhost/test";
    private final String user = "postgres";
    private final String password = "mithun";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");
            } else {
                System.out.println("Failed to make connection!");
            }
            PreparedStatement pst = conn.prepareStatement("SELECT date '2001-09-28' + integer '7'");
            PreparedStatement pst1 = conn.prepareStatement("SELECT date '2021-09-28' + integer '7'");
            ResultSet rs = pst.executeQuery();
            ResultSet rs2 = pst1.executeQuery();
           // System.out.println(rs);
        while (rs.next()) {
        
           // System.out.print(rs.getInt(1));
            //System.out.print(": ");
            System.out.println(rs.getString(1));
           
        }
        while(rs2.next())
        {
        	 System.out.println(rs2.getString(1));
        }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JDBCPostgreSQLConnection app = new JDBCPostgreSQLConnection();
        app.connect();
    }
}
