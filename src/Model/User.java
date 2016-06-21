package Model;

import java.util.Date;

public class User extends Person{
    private String _NickName;
    private String _Password;
    
    public User(String pName, String pEmail, String pPhone, String pAddress, Date pBirthdate){
        super(pName, pEmail, pPhone, pAddress, pBirthdate);
    }
    public String getNickName() {
        return _NickName;
    }

    public void setNickName(String _NickName) {
        this._NickName = _NickName;
    }

    public String getPassword() {
        return _Password;
    }

    public void setPassword(String _Password) {
        this._Password = _Password;
    }
    
    
}
