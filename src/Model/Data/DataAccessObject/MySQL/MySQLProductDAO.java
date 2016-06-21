
package Model.Data.DataAccessObject.MySQL;

import Model.Data.DataAccessObject.ProductDAO;
import Model.Data.MySQLDAOFactory;
import Model.Packing;
import Model.Product;
import Model.ProductBrand;
import Model.ProductCategory;
import Model.ProductType;
import Model.Section;
import Model.TruckModel;
import Model.User;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MySQLProductDAO implements ProductDAO{

    @Override
    public int insertProduct(Product pProduct) {
        Connection conn = null;
        CallableStatement stmt;
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            String insertTableSQL = "INSERT INTO product(name, idCategory,idType,volume,price,idSection,idPacking,idBrand)" +
"                       VALUES"+"(?,?,?,?,?,?,?,?);";
            stmt = conn.prepareCall(insertTableSQL);
            stmt.setString(1, pProduct.getName());
            stmt.setInt(2, pProduct.getCategory().getIdCategory());
            stmt.setInt(3, pProduct.getType().getIdType());          
            stmt.setInt(4, pProduct.getVolume());
            stmt.setInt(5, pProduct.getPrice());
            stmt.setInt(6, pProduct.getSection().getIDSection());
            stmt.setInt(7, pProduct.getTypePackaging().getIdPacking());                        
            stmt.setInt(8, pProduct.getBrand().getIdproductBand());
            stmt.executeUpdate();
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
            return -1;
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
        System.out.println("Producto agregado");
        return 1;
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
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Product> productList = new ArrayList<Product>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM Product");
            rs = stmt.executeQuery();
            while(rs.next()){
                int productID = rs.getInt("idProduct");
                ProductCategory category = this.findCategory(productID);
                ProductType type = this.findTypes(productID);
                ProductBrand brand = this.findBrand(productID);
                Packing typePacking = this.findPackings(productID);
                
                productList.add(new Product(productID, rs.getString("name"),category, type, brand, typePacking,
                 rs.getInt("volume"), rs.getInt("price")));
                
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
        return productList;
    }

    @Override
    public ArrayList<ProductBrand> selectBrands() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductBrand> productBrandList = new ArrayList<ProductBrand>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM productBrand");
            rs = stmt.executeQuery();
            while(rs.next()){
                productBrandList.add(new ProductBrand(rs.getInt("idproductBrand"),rs.getString("name")));
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
    public ProductBrand findBrand(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductBrand> productBrandList = new ArrayList<ProductBrand>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM productBrand where idproductBrand="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                productBrandList.add(new ProductBrand(rs.getInt("idproductBrand"),rs.getString("name")));
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
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Packing> packingsList = new ArrayList<Packing>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM packing where idpacking="+pID);
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
        return packingsList.get(0);
    }

    @Override
    public ArrayList<ProductType> selectTypes() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductType> productTypesList = new ArrayList<ProductType>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM typeProduct");
            rs = stmt.executeQuery();
            while(rs.next()){
                productTypesList.add(new ProductType(rs.getInt("idtypeProduct"),rs.getString("name")));
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
    public ProductType findTypes(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductType> productTypesList = new ArrayList<ProductType>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM typeProduct where idtypeProduct="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                productTypesList.add(new ProductType(rs.getInt("idtypeProduct"),rs.getString("name")));
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
        return productTypesList.get(0);
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
    public Section findSections(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Section> sectionList = new ArrayList<Section>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM section where idsection = "+pID);
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
        return sectionList.get(0);
    }

    @Override
    public ArrayList<ProductCategory> selectCategories() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductCategory> sectionList = new ArrayList<ProductCategory>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM section");
            rs = stmt.executeQuery();
            while(rs.next()){
                sectionList.add(new ProductCategory(rs.getInt("idcategory"), rs.getString("name")));
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
    public ProductCategory findCategory(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <ProductCategory> sectionList = new ArrayList<ProductCategory>();
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM section where idcategory="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                sectionList.add(new ProductCategory(rs.getInt("idcategory"), rs.getString("name")));
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
        return sectionList.get(0);
    }




}
