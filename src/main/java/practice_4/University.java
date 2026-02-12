package practice_4;

public class University {
    static String universityName;
    final int studentID;
    private String studentName;

    University (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student's mane is " + getStudentName() + ", student's ID is " + studentID + ", University name is " + universityName);
    }

}
