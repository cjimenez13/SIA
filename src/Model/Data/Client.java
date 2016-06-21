package Model.Data;

import Model.Data.DataAccessObject.AccountDAO;
import Model.Data.DataAccessObject.ProductDAO;

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
    public void getProducts(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectProducts();
    }
    public void getProductsBrands(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectBrands();
    }
    public void getProductsPacking(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectPackings();
    }
    public void getProductsTypes(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectTypes();
    }
    public void getProductsSections(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectSections();
    }
    public void getProductsCategories(){
        ProductDAO productDAO = _MYSQLFactory.getProductDAO();
        productDAO.selectCategories();
    }
    
    
    

}
