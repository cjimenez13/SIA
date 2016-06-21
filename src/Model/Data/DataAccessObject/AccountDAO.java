package Model.Data.DataAccessObject;

import Model.User;
import java.util.ArrayList;

public interface AccountDAO {
    public void insertAccount(User pUser);
    public boolean updateAccount(User pUser);
    public User findAccount(int pID);
    public boolean deleteAccount(int pID);
    public ArrayList<User> selectAccountTO();

}
