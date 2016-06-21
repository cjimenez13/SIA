package Model.Data.DataAccessObject;

import Model.Packing;
import Model.Product;
import Model.ProductBrand;
import Model.ProductCategory;
import Model.ProductType;
import Model.Section;
import java.util.ArrayList;

public interface ProductDAO {
    public int insertProduct(Product pProduct);
    public boolean updateProduct(Product pProduct);
    public Product findProduct(int pID);
    public boolean deleteProduct(int pID);
    public ArrayList<Product> selectProducts();
    
    public ArrayList<ProductBrand> selectBrands();
    public ProductBrand findBrand(int pID);
    
    public ArrayList<Packing> selectPackings();
    public Packing findPackings(int pID);
    
    public ArrayList<ProductType> selectTypes();
    public ProductType findTypes(int pID);
    
    public ArrayList<Section> selectSections();
    public Section findSections(int pID);
    
    public ArrayList<ProductCategory> selectCategories();
    public ProductCategory findCategory(int pID);
    
    
    
}
