public class TutorBatch {

    //ATTRIBUTES
    private Tutor[] tutors;
    private int tutorCount;

    private int indexRef;

    //CONSTRUCTORS
    public TutorBatch(int maxTutors) {
        tutors = new Tutor[maxTutors];
        tutorCount = 0;
        indexRef = 0;
    }

    //METHODS
    public boolean findTutor(String lname) {
        for (int i = 0; i < tutorCount; i++) {
            if (tutors[i].getName().getLName() == lname) {
                indexRef = i;
                return true;
            }
        }

        return false;
    }

    public void addTutor(Tutor tutor) throws Exception{
        if (tutorCount >= tutors.length) {
            throw new Exception("Limit of tutors exceeded.");
        }

        else {
            tutors[tutorCount++] = tutor;
        }
    }

    public void removeTutor(String lname) throws Exception{
        if (findTutor(lname) == true) {
            for (int i = indexRef; i < tutorCount; i++) {
                if (i + 1 >= tutors.length) {
                    tutorCount--;
                    return;
                }

                else {
                    tutors[i] = tutors[i + 1];
                }
            }

            tutorCount--;
        }

        else {
            throw new Exception("Tutor not found.");
        }
    }

    public void dispTutors() {
        if (tutorCount == 0) {
            System.out.println("No tutors listed.\n");
        }

        else {
            System.out.println("Tutors: ");

            for (int i = 0; i < tutorCount; i++) {
                System.out.println(tutors[i].getName().getLName());
            }

            System.out.println("\n");
        }
    }

    public int getTutorCount() {
        return tutorCount;
    }


}
