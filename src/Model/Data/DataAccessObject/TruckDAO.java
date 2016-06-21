package Model.Data.DataAccessObject;

import Model.Truck;
import Model.TruckModel;
import java.util.ArrayList;

public interface TruckDAO {
    public void insertTruck(Truck pTruck);
    public boolean updateTruck(Truck pTruck);
    public Truck findTruck(int pID);
    public boolean deleteTruck(int pID);
    public ArrayList<Truck> selectTrucks();
    

    public ArrayList<TruckModel> selectModelsTrucks();
    public TruckModel findModelTruck(int pID);
    public String findBrandTruck(int pID);

    
}
