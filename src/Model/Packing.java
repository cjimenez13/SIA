package Model;


public class Packing {
    private int _IdPacking;
    private String _Name;
    private String _MeasureUnit;
    
    public Packing(int pID, String pName, String pMeasureUnit){
        this._IdPacking = pID;
        this._Name = pName;
        this._MeasureUnit = pMeasureUnit;
    }

    public int getIdPacking() {
        return _IdPacking;
    }

    public String getName() {
        return _Name;
    }

    public String getMeasureUnit() {
        return _MeasureUnit;
    }
    
}

