import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection_main {

    private Connection dm;
    private String dbUrl;
    private String user;
    private String pass;


    public void connect(String user, String pass) throws SQLException {
        dm = DriverManager.getConnection(dbUrl, user, pass);
    }

    public void retry() {
        int i = 0;
        try {
            while (dm.isClosed() && i < 3) {
                connect(user, pass);
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Unable to connect to db after " + i + "retry");
        }
    }

    public Connection getConn() throws SQLException {
        if (dm == null) {
            connect(getUser(), getPass());
        }
        return dm;
    }

    public void setUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUrl() {
        return dbUrl;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
