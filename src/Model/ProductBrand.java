package Model;

public class ProductBrand {
    private int idproductBand;
    private String _Name;
    
    public ProductBrand(int pID, String pName){
        this.idproductBand = pID;
        this._Name = pName;
    }

    public int getIdproductBand() {
        return idproductBand;
    }

    public String getName() {
        return _Name;
    }
    
}
