package Model;

public class Truck {
    private int _IdTruck;
    private String _LicensePlate;
    private int _Year;
    private TruckModel _Model;
    private String _Brand;
    private boolean _State;
    private boolean _RTV;

    public Truck(int pID, String pLicensePlate, TruckModel pModel, String pBrand, boolean pState, boolean pRTV){
        this._IdTruck = pID;
        this._LicensePlate = pLicensePlate;
        this._Model = pModel;
        this._Brand = pBrand;
        this._State = pState;
        this._RTV = pRTV;
    }
    public String getLicensePlate() {
        return _LicensePlate;
    }

    public void setLicensePlate(String _LicensePlate) {
        this._LicensePlate = _LicensePlate;
    }

    public int getYear() {
        return _Year;
    }

    public void setYear(int _Year) {
        this._Year = _Year;
    }

    public TruckModel getModel() {
        return _Model;
    }

    public void setModel(TruckModel _Model) {
        this._Model = _Model;
    }

    public String getBrand() {
        return _Brand;
    }

    public void setBrand(String _Brand) {
        this._Brand = _Brand;
    }

    public boolean isState() {
        return _State;
    }

    public void setState(boolean _State) {
        this._State = _State;
    }
    
}
