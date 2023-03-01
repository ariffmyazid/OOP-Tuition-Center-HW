public class HeadMaster {

    //ATTRIBUTES
    private Name name;

    //CONSTRUCTORS
    public HeadMaster() {
        name = new Name();
    }

    public HeadMaster(String lname) {
        name = new Name(lname);
    }

    //SETTERS & GETTERS
    public void setName(String fname, String mname, String lname) {
        name.setFName(fname);
        name.setMName(mname);
        name.setLName(lname);
    }

    public Name getName() {
        return name;
    }

    public String getStringName() {
        return name.getFullName();
    }
}
