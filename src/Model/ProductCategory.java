package Model;

public class ProductCategory {
    private int _IdCategory;
    private String _Name;
    
    public ProductCategory(int pID, String pName){
        this._IdCategory = pID;
        this._Name = pName;
    }

    public int getIdCategory() {
        return _IdCategory;
    }

    public String getName() {
        return _Name;
    }
    
}
