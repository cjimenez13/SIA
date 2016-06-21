
package Model;


public class TruckModel {
    private int _IdModel;
    private String _ModelSerial;
    private int _CapacityVol;
    private String _GasType; 

    public TruckModel(int pID, String pModelSerial, int pCapacityVol, String pGasType){
        this._IdModel = pID;
        this._ModelSerial = pModelSerial;
        this._CapacityVol = pCapacityVol;
        this._GasType = pGasType;
    }
        
    public int getIdModel() {
        return _IdModel;
    }

    public void setIdModel(int _IdModel) {
        this._IdModel = _IdModel;
    }

    public String getModelSerial() {
        return _ModelSerial;
    }

    public void setModelSerial(String _ModelSerial) {
        this._ModelSerial = _ModelSerial;
    }

    public int getCapacityVol() {
        return _CapacityVol;
    }

    public void setCapacityVol(int _CapacityVol) {
        this._CapacityVol = _CapacityVol;
    }

    public String getGasType() {
        return _GasType;
    }

    public void setGasType(String _GasType) {
        this._GasType = _GasType;
    }
    
    
    
}
