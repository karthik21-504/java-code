import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class operationCRUD {

    private static final connection_main cm = new connection_main();

    public operationCRUD() {
    }
//    public void initialize() {
//        try {
//            verifyDB();
//        }
//        catch(SQLException e){
//            System.out.println("No db exists with given name"+ e);
//        }
//    }

//    private boolean verifyDB(String db) throws SQLException {
//        executeCommands("show databases");
//
//    }

    public void initialise(String url) {
        cm.setUrl(url);
    }

    public void setCreds(String user,String pass) {
        cm.setUser(user);
        cm.setPass(pass);
    }


    public void executeSimpleCommands(String command) throws SQLException {
        Connection nc = cm.getConn();
        Statement st = nc.createStatement();
        st.executeUpdate(command);
    }

    public ResultSet executeCommands(String command) throws SQLException {
        Connection nc = cm.getConn();
        Statement st = nc.createStatement();
        st.executeQuery(command);
        return st.executeQuery(command);
    }

    public void resultSetToPrint(ResultSet x) throws SQLException {
        int n = x.getMetaData().getColumnCount();
        for (int j = 1; j <= n; j++) {
            System.out.print(x.getMetaData().getColumnName(j) + " ");
        }
        System.out.println();
        while (x.next()) {
            for (int i = 1; i <= n; i++) {
                System.out.print(x.getString(i) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printData(String table) throws SQLException {
        String s = "select * from " + table;
        resultSetToPrint(executeCommands(s));
    }

    public void createDB(String name) throws SQLException {
        String s = "Create database " + name;
        executeSimpleCommands(s);
    }

    public void SelectDB(String name) throws SQLException {
        String s = "USE " + name;
        executeSimpleCommands(s);
    }

    public void dropTable(String table) throws SQLException {
        String s = "DROP Table " + table;
        executeSimpleCommands(s);
    }

    public void createTable(String table, String... all) throws SQLException {
        StringBuilder q = new StringBuilder("Create table " + table + " ( ");
        for (int i = 0; i < all.length - 1; ) {
            q.append(all[i]).append(",");
            i++;
        }
        q.append(all[all.length - 1]).append(" );");
        String fq = q.toString();
        executeSimpleCommands(fq);
    }

    public void insertData(String table, String... v) throws SQLException {
        StringBuilder q = new StringBuilder("insert into " + table + " values (");
        for (int i = 0; i < v.length - 1; ) {
            q.append(v[i]).append(", ");
            i++;
        }
        q.append(v[v.length - 1]).append(");");
        String s = q.toString();
        System.out.println(q);
        executeSimpleCommands(s);
    }

    //DELETE FROM "TABLE" WHERE condition
    public void deleteData(String table, String condition) throws SQLException {
        String s = "DELETE from "+ table + " WHERE "+ condition+";";
        System.out.println(s);
        executeSimpleCommands(s);
    }

    public void sortData(String table, String column) throws SQLException{
        String s = "SELECT * FROM " + table + " ORDER BY "+column + ";";
        System.out.println(s);
        resultSetToPrint(executeCommands(s));
    }
}
