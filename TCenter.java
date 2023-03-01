public class TCenter {

    //ATTRIBUTES
    private HeadMaster hm;
    private Address address;
    private TutorBatch tb;
    private StudentBatch sb;

    //CONSTRUCTORS
    public TCenter(int maxTutors, int maxStudents) {
        hm = new HeadMaster();
        address = new Address();
        tb = new TutorBatch(maxTutors);
        sb = new StudentBatch(maxStudents);
    }

    //SETTERS & GETTERS
    public void setHm(HeadMaster hm) {
        this.hm = hm;
    }

    public HeadMaster getHm() {
        return hm;
    }

    public void setAddress(String line1, String line2, String postcode, String city, String state) {
        address.setLine1(line1);
        address.setLine2(line2);
        address.setPostcode(postcode);
        address.setCity(city);
        address.setState(state);
    }

    public Address getAddress() {
        return address;
    }

    public String getStringAddress() {
        return address.getFullAddress();
    }

    public void setTb(TutorBatch tb) {
        this.tb = tb;
    }

    public TutorBatch getTb() {
        return tb;
    }

    public void setSb(StudentBatch sb) {
        this.sb = sb;
    }

    public StudentBatch getSb() {
        return sb;
    }
}
