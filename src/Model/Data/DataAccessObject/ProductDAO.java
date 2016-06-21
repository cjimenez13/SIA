package Model.Data.DataAccessObject;

import Model.Packing;
import Model.Product;
import Model.Section;
import java.util.ArrayList;

public interface ProductDAO {
    public void insertProduct(Product pProduct);
    public boolean updateProduct(Product pProduct);
    public Product findProduct(int pID);
    public boolean deleteProduct(int pID);
    public ArrayList<Product> selectProducts();
    
    public ArrayList<String> selectBrands();
    public String findBrand(int pID);
    
    public ArrayList<Packing> selectPackings();
    public Packing findPackings(int pID);
    
    public ArrayList<String> selectTypes();
    public String findTypes(int pID);
    
    public ArrayList<Section> selectSections();
    public String findSections(int pID);
    
    
    
}
