package Model.Data;

import Model.Data.DataAccessObject.AccountDAO;

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
}
