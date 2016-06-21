package Model.Data.DataAccessObject.MySQL;

import Model.Data.DataAccessObject.TruckDAO;
import Model.Data.MySQLDAOFactory;
import Model.Truck;
import Model.TruckModel;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class MySQLTruckDAO implements TruckDAO{

    @Override
    public void insertTruck(Truck pTruck) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateTruck(Truck pTruck) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Truck findTruck(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteTruck(int pID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Truck> selectTrucks() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <Truck> truckList = new ArrayList<Truck>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM truck");
            rs = stmt.executeQuery();
            while(rs.next()){
                Truck tempTruck = new Truck(rs.getInt("idTruck"),rs.getString("licencePlate"),
                        this.findModelTruck(rs.getInt("model_ID")),this.findBrandTruck(rs.getInt("brandID")),rs.getBoolean("state"), rs.getBoolean("RTV"));
                truckList.add(tempTruck);
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        return truckList;
        
    }

    @Override
    public ArrayList<TruckModel> selectModelsTrucks() {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <TruckModel> truckModelList = new ArrayList<TruckModel>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM Model");
            rs = stmt.executeQuery();
            while(rs.next()){
                TruckModel tempTruckModel = new TruckModel(rs.getInt("idModel"),rs.getString("ModelSerial"),rs.getInt("capacityVol"),rs.getString("gasType"));
                truckModelList.add(tempTruckModel);
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        return truckModelList;
    }

    @Override
    public TruckModel findModelTruck(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <TruckModel> truckModelList = new ArrayList<TruckModel>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM Model where idModel="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                TruckModel tempTruckModel = new TruckModel(rs.getInt("idModel"),rs.getString("ModelSerial"),rs.getInt("capacityVol"),rs.getString("gasType"));
                truckModelList.add(tempTruckModel);
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        return truckModelList.get(0);
    }

    @Override
    public String findBrandTruck(int pID) {
        Connection conn = null;
        PreparedStatement stmt;
        ResultSet rs;
        ArrayList <String> truckBrandList = new ArrayList<String>();
        
        try{  
            conn = MySQLDAOFactory.createConnection();
            stmt = conn.prepareStatement("SELECT * FROM Brand where idbrand="+pID);
            rs = stmt.executeQuery();
            while(rs.next()){
                truckBrandList.add(rs.getString("name"));
            }
        } 
        catch(SQLException e){
            System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
        }
        finally{
            if(conn != null){
                try{
                    conn.close();
                }
                catch(SQLException e){
                    System.out.println("Message: " + e.getMessage() + "\n" + "Code: " + e.getErrorCode());
                }
            }
        }
        return truckBrandList.get(0);
    }
    
}
