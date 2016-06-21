package Model;

public class Section {
    private int _IDSection;
    private String _Name;
    private String _Description;
   
    public Section(int pID, String pName, String pDescription){
        this._IDSection = pID;
        this._Name = pName;
        this._Description = pDescription;
    }

    public int getIDSection() {
        return _IDSection;
    }

    public String getName() {
        return _Name;
    }

    public String getDescription() {
        return _Description;
    }
    
}
