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
}
