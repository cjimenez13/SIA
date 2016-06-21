
package Model;

public class ProductType {
    private int _IdType;
    private String _Name;
    
    public ProductType(int pID, String pName){
        this._IdType = pID;
        this._Name = pName;
    }

    public int getIdType() {
        return _IdType;
    }

    public String getName() {
        return _Name;
    }
    
}
