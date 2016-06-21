
package Model;

import java.util.Date;

public class Driver extends Person{
    private int _Code;
    private boolean isAvailable;
    private Date _HireDate;
    public Driver (String pName, String pEmail, String pPhone, String pAddress, Date pBirthdate){
        super(pName, pEmail, pPhone, pAddress, pBirthdate);
    }
}
