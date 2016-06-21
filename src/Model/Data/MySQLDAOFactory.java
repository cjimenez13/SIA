package Model.Data;

import Model.Data.DataAccessObject.AccountDAO;
import Model.Data.DataAccessObject.MySQL.MySQLAccountDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLDAOFactory extends DAOFactory {
    protected static String _UserName = "root";
    protected static String _Password = "1234Datos";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/SIA_DB";
    
    public static Connection createConnection(){
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/SIA_DB",_UserName,_Password);
        } 
        catch(ClassNotFoundException ex){
            System.out.println("Message: " + ex.getMessage());
        } 
        catch(SQLException ex) {
            System.out.println("Message: " + ex.getMessage() + "\n" + "Code: " + ex.getErrorCode());
        }
        return conn;
    }

    @Override
    public AccountDAO getAccountDAO() {
        return new MySQLAccountDAO();
    }
}
