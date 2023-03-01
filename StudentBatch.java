public class StudentBatch {

    //ATTRIBUTES
    private Student[] students;
    private int studentCount;
    private int indexRef;
    private float avg;
    private Student best;
    private Student worst;

    //CONSTRUCTORS
    public StudentBatch(int maxStudents) {
        students = new Student[maxStudents];
        studentCount = 0;
        indexRef = 0;
        avg = 0;
    }

    //METHODS
    public boolean findStudent(String lname) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getName().getLName() == lname) {
                indexRef = i;
                return true;
            }
        }

        return false;
    }

    public void addStudent(Student student) throws Exception{
        if (studentCount >= students.length) {
            throw new Exception("Limit of students exceeded.");
        }

        else {
            students[studentCount++] = student;
        }
    }

    public void removeStudent(String lname) throws Exception{
        if (findStudent(lname) == true) {
            for (int i = indexRef; i < studentCount; i++) {
                if (i + 1 >= students.length) {
                    studentCount--;
                    return;
                }

                else {
                    students[i] = students[i + 1];
                }
            }

            studentCount--;
        }

        else {
            throw new Exception("Student not found.");
        }
    }

    public void dispStudents() {
        if (studentCount == 0) {
            System.out.println("No students listed.\n");
        }

        else {
            System.out.println("Students: ");

            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i].getName().getLName());
            }

            System.out.println("\n");
        }
    }

    public int getStudentCount() {
        return studentCount;
    }

    public float getAvg() {
        float sum = 0;

        for (int i = 0; i< studentCount; i++) {
            sum += students[i].getAvg();
        }

        avg = sum / studentCount;

        return avg;
    }

    public Student getBest() {
        for (int i = 0; i < studentCount; i++) {
            if (i == 0) {
                best = students[i];
            }

            else if (students[i].getAvg() >= best.getAvg()) {
                best = students[i];
            }
        }

        return best;
    }

    public Student getWorst() {
        for (int i = 0; i < studentCount; i++) {
            if (i == 0) {
                worst = students[i];
            }

            else if (students[i].getAvg() <= worst.getAvg()) {
                worst = students[i];
            }
        }

        return worst;
    }


 }
