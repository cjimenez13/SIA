package Model;

public class Product {
    private int _IDProduct;
    private String _Name;
    private String _Category;
    private String _Type;
    private String _Brand;
    private String _TypePackaging;
    private int _Volume;
    private int _Price;

    public String getCategory() {
        return _Category;
    }

    public void setCategory(String _Category) {
        this._Category = _Category;
    }

    public String getType() {
        return _Type;
    }

    public void setType(String _Type) {
        this._Type = _Type;
    }

    public String getName() {
        return _Name;
    }

    public void setName(String _Name) {
        this._Name = _Name;
    }

    public String getBrand() {
        return _Brand;
    }

    public void setBrand(String _Brand) {
        this._Brand = _Brand;
    }

    public String getTypePackaging() {
        return _TypePackaging;
    }

    public void setTypePackaging(String _TypePackaging) {
        this._TypePackaging = _TypePackaging;
    }

    public int getVolume() {
        return _Volume;
    }

    public void setVolume(int _Volume) {
        this._Volume = _Volume;
    }

    public int getPrice() {
        return _Price;
    }

    public void setPrice(int _Price) {
        this._Price = _Price;
    }
    
    
    
}
