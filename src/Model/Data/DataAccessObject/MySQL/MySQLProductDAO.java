
package Model.Data.DataAccessObject.MySQL;

import Model.Data.DataAccessObject.ProductDAO;
import Model.Data.MySQLDAOFactory;
import Model.Packing;
import Model.Product;
import Model.Section;
import Model.TruckModel;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MySQLProductDAO implements ProductDAO{

    @Override
    public void insertProduct(Product pProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProduct(Product pProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findProduct(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteProduct(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> selectProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> selectBrands() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <String> productBrandList = new ArrayList<String>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM productBrand");
            rs = stmt.executeQuery();
            while(rs.next()){
                productBrandList.add(rs.getString("name"));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
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
        return productBrandList;
    }

    @Override
    public String findBrand(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <String> productBrandList = new ArrayList<String>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM productBrand where idproductBrand="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                productBrandList.add(rs.getString("name"));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
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
        return productBrandList.get(0);
    }

    @Override
    public ArrayList<Packing> selectPackings() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Packing> packingsList = new ArrayList<Packing>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM packing");
            rs = stmt.executeQuery();
            while(rs.next()){
                packingsList.add(new Packing(rs.getInt("idpacking"),rs.getString("name"),rs.getString("measureUnit")));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
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
        return packingsList;
    }

    @Override
    public Packing findPackings(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> selectTypes() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <String> productTypesList = new ArrayList<String>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM typeProduct");
            rs = stmt.executeQuery();
            while(rs.next()){
                productTypesList.add(rs.getString("name"));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
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
        return productTypesList;
    }

    @Override
    public String findTypes(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Section> selectSections() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Section> sectionList = new ArrayList<Section>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM section");
            rs = stmt.executeQuery();
            while(rs.next()){
                sectionList.add(new Section(rs.getInt("idsection"), rs.getString("name"),rs.getString("description")));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
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
        return sectionList;
    }

    @Override
    public String findSections(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}
