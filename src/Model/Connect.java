
package Model;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connect {
    
    public Connection connect() throws SQLException{
    String server = "Long\\HOANGLONG";
        String user = "sa";
        String password = "123";
        String database = "QuanLyChungCu";
        int port = 1433;

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(database);
        ds.setPortNumber(port);
        ds.setServerName(server);
        ds.setTrustServerCertificate(true);
    
    
     return ds.getConnection();
    }
}
