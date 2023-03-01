public class Main {
    public static void main(String[] args) {
        TCenter tc1 = new TCenter(100, 100);
        tc1.setHm(new HeadMaster("Maxwell"));
        tc1.setTb(new TutorBatch(100));
        tc1.setSb(new StudentBatch(100));

        Tutor azam = new Tutor(3, "Azam");
        Tutor barbara = new Tutor(3, "Barbara");
        Tutor chew = new Tutor(3, "Chew");

        Student ahmad = new Student(3, "Ahmad");
        Student badrul = new Student(3, "Badrul");
        Student courtney = new Student(3, "Courtney");

        try {
            tc1.getTb().addTutor(azam);
            tc1.getTb().addTutor(barbara);
            tc1.getTb().addTutor(chew);

            tc1.getSb().addStudent(ahmad);
            ahmad.setTutor(azam);
            ahmad.addScore(12);
            ahmad.addScore(32);
            ahmad.addScore(29);

            tc1.getSb().addStudent(badrul);
            badrul.setTutor(azam);
            badrul.addScore(56);
            badrul.addScore(67);
            badrul.addScore(61);

            tc1.getSb().addStudent(courtney);
            courtney.setTutor(azam);
            courtney.addScore(95);
            courtney.addScore(90);
            courtney.addScore(92);

            System.out.println("Headmaster     : " + tc1.getHm().getName().getLName());
            System.out.println("No. of Tutors  : " + tc1.getTb().getTutorCount());
            System.out.println("No. of Students: " + tc1.getSb().getStudentCount() + "\n");

            tc1.getTb().dispTutors();
            tc1.getSb().dispStudents();

            System.out.println("Tutor         : " + azam.getName().getLName());
            System.out.println("Average Scores: " + azam.getStudents().getAvg());
            System.out.println("Best Student  : " + azam.getStudents().getBest().getName().getLName());
            System.out.println("Worst Student : " + azam.getStudents().getWorst().getName().getLName() + "\n");

            System.out.println("Student       : " + ahmad.getName().getLName());
            System.out.println("Average Scores: " + ahmad.getAvg());
            System.out.println("Highest Score : " + ahmad.getMax());
            System.out.println("Lowest Score  : " + ahmad.getMin() + "\n");

            System.out.println("Student       : " + badrul.getName().getLName());
            System.out.println("Average Scores: " + badrul.getAvg());
            System.out.println("Highest Score : " + badrul.getMax());
            System.out.println("Lowest Score  : " + badrul.getMin() + "\n");

            System.out.println("Student       : " + courtney.getName().getLName());
            System.out.println("Average Scores: " + courtney.getAvg());
            System.out.println("Highest Score : " + courtney.getMax());
            System.out.println("Lowest Score  : " + courtney.getMin() + "\n");

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }
}