package Model;

public class Product {
    private int _IDProduct;
    private String _Name;
    private ProductCategory _Category;
    private ProductType _Type;
    private ProductBrand _Brand;
    private Packing _TypePackaging;
    private Section _Section;
    private int _Volume;
    private int _Price;
    
    public Product(int pID, String pName, ProductCategory pCategory, ProductType pType, ProductBrand pBrand, 
            Packing pTypePacking, int pVolume, int pPrice){
        this._IDProduct = pID;
        this._Name = pName;
        this._Category = pCategory;
        this._Type = pType;
        this._Brand = pBrand;
        this._TypePackaging = pTypePacking;
        this._Volume =  pVolume;
        this._Price = pPrice;
        
        
    }

    public Section getSection() {
        return _Section;
    }

    
    public int getIDProduct() {
        return _IDProduct;
    }

    public String getName() {
        return _Name;
    }

    public ProductCategory getCategory() {
        return _Category;
    }

    public ProductType getType() {
        return _Type;
    }

    public ProductBrand getBrand() {
        return _Brand;
    }

    public Packing getTypePackaging() {
        return _TypePackaging;
    }

    public int getVolume() {
        return _Volume;
    }

    public int getPrice() {
        return _Price;
    }
    

    
    
    
}
