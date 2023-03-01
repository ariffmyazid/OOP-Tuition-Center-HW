public class Tutor {

    //ATTRIBUTES
    private Name name;
    private String IC;
    private Address address;
    private String qualification;
    private int yearExp;
    private Date joinDate;
    private int yearExpHere;
    private StudentBatch students;

    //CONSTRUCTORS
    public Tutor() {}

    public Tutor(String lname) {
        name = new Name(lname);
    }

    public Tutor(int maxStudents, String lname) {
        name = new Name(lname);
        address = new Address();
        joinDate = new Date();
        students = new StudentBatch(maxStudents);
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

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getIC() {
        return IC;
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

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }

    public int getYearExp() {
        return yearExp;
    }

    public void setJoinDate(int day, int month, int year) {
        joinDate.setDay(day);
        joinDate.setMonth(month);
        joinDate.setYear(year);
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public String getStringJoinDate() {
        return joinDate.getFullDate();
    }

    public void setYearExpHere(int yearExpHere) {
        this.yearExpHere = yearExpHere;
    }

    public int getYearExpHere() {
        return yearExpHere;
    }

    public void setStudents(StudentBatch students) {
        this.students = students;
    }

    public StudentBatch getStudents() {
        return students;
    }


}
