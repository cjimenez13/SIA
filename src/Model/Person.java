package Model;

import java.util.Date;

public class Person {
    private String _Name;
    private String _Email;
    private String _Phone;
    private String _Address;
    private Date _Birthdate;

    protected Person(String pName, String pEmail, String pPhone, String pAddress, Date pBirthdate){
        this._Name =  pName;
        this._Email = pEmail;
        this._Phone = pPhone;
        this._Address = pAddress;
        this._Birthdate = pBirthdate;
    }
    public String getName() {
        return _Name;
    }

    public void setName(String _Name) {
        this._Name = _Name;
    }

    public String getEmail() {
        return _Email;
    }

    public void setEmail(String _Email) {
        this._Email = _Email;
    }

    public String getPhone() {
        return _Phone;
    }

    public void setPhone(String _Phone) {
        this._Phone = _Phone;
    }

    public String getAddress() {
        return _Address;
    }

    public void setAddress(String _Address) {
        this._Address = _Address;
    }

    public Date getBirthdate() {
        return _Birthdate;
    }

    public void setBirthdate(Date _Birthdate) {
        this._Birthdate = _Birthdate;
    }
    
    
}
