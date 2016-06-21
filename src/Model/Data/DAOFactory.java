package Model.Data;

import Model.Data.DataAccessObject.AccountDAO;
import Model.Data.DataAccessObject.ProductDAO;

public abstract class DAOFactory {

    public static final int MYSQL = 5;
    
    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){
          case MYSQL: 
              return new MySQLDAOFactory();
          default: 
              return null;
        }
    }
    public abstract AccountDAO getAccountDAO();
    public abstract ProductDAO getProductDAO();
}
