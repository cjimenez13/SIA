
package Model.Data.DataAccessObject;

import Model.Driver;
import java.util.ArrayList;


public interface DriverDAO {
    public void insertDriver(Driver pDriver);
    public boolean updateDriver(Driver pDriver);
    public Driver findDriver(int pID);
    public boolean deleteDriver(int pID);
    public ArrayList<Driver> selectDriverTO();
}
