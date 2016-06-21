package Model.Data.DataAccessObject.MySQL;

import Model.Data.DataAccessObject.AccountDAO;
import Model.Data.MySQLDAOFactory;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLAccountDAO implements AccountDAO{

    @Override
    public ArrayList<User> selectAccountTO() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <User> userList = new ArrayList<User>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            System.out.println("hola");
            //stmt = conn.prepareStatement("SELECT * FROM Agente");
            //rs = stmt.executeQuery();
                        
            //while(rs.next()){
                //User tempAgent = new User(rs.getString("Usuario"),rs.getString("Contraseña"));
                //agentList.add(tempAgent);
            //}
        } 
        //catch(SQLException e){
            //System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        //}
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        return userList;    
    }

    @Override
    public void insertAccount(User pUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateAccount(User pUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findAccount(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteAccount(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
