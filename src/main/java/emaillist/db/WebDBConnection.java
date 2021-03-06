package emaillist.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WebDBConnection implements DBConnection {
    public Connection getConnection() throws SQLException {
        Connection conn = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/webdb";
            conn = DriverManager.getConnection(url, "webdb", "webdb");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
