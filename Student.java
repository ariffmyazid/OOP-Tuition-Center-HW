public class Student {

    //ATTRIBUTES
    private Name name;
    private String IC;
    private Address address;
    private String schoolYear;
    private String schoolName;
    private Tutor tutor;
    private int[] scores;
    private int scoreCount;
    private float avg;
    private int max;
    private int min;

    //CONSTRUCTORS
    public Student() {}

    public Student(String lname) {
        name = new Name(lname);
    }

    public Student(int maxScores, String lname) {
        name = new Name(lname);
        address = new Address();
        tutor = new Tutor();
        scores = new int[maxScores];
        scoreCount = 0;
        avg = 0;
        max = 0;
        min = 0;
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

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setTutor(Tutor tutor) throws Exception {
        this.tutor = tutor;
        tutor.getStudents().addStudent(this);
    }

    public Tutor getTutor() {
        return tutor;
    }

    public String getStringTutor() {
        return tutor.getStringName();
    }

    //OTHER
    public void addScore(int score) throws Exception{
        if (scoreCount >= scores.length) {
            throw new Exception("Limit of scores exceeded.");
        }

        else if (score < 0 || score > 100) {
            throw new Exception("Invalid score.");
        }

        else {
            scores[scoreCount++] = score;
        }
    }

    public void dispScores() {
        if (scoreCount == 0) {
            System.out.println("No scores listed.\n");
        }

        else {
            System.out.println(name.getFName() + "'s scores: ");

            for (int i = 0; i < scoreCount; i++) {
                System.out.print(scores[i] + " ");
            }

            System.out.println("\n");
        }

    }

    public int getScoreCount() {
        return scoreCount;
    }

    public float getAvg() {
        int sum = 0;

        for (int i = 0; i < scoreCount; i++) {
            sum += scores[i];
        }

        avg = (float) sum / scoreCount;

        return avg;
    }

    public int getMax() {
        for (int i = 0; i < scoreCount; i++) {
            if (i == 0) {
                max = scores[i];
            }

            else if (scores[i] >= max){
                max = scores[i];
            }
        }

        return max;
    }

    public int getMin() {
        for (int i = 0; i < scoreCount; i++) {
            if (i == 0) {
                min = scores[i];
            }

            else if (scores[i] <= min){
                min = scores[i];
            }
        }

        return min;
    }
}
