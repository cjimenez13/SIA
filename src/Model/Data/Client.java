package Model.Data;

import Model.Data.DataAccessObject.AccountDAO;

public class Client {
    private static Client _Instance = null;
    private DAOFactory _MYSQLFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    
    private Client(){}
    
    private static void createInstance(){
        if (_Instance == null)
            _Instance = new Client();
    }
   
    public static synchronized Client getInstance(){
        createInstance();
        return _Instance;
    }
    public void getPersons(){
        AccountDAO accountDAO = _MYSQLFactory.getAccountDAO();
        accountDAO.selectAccountTO();
        
    }
    
    

}
