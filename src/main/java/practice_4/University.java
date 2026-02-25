package practice_4;

public class University {
    static String universityName;
    final int studentID;
    private String studentName;

    public University (int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Student's name is " + getStudentName() + ", student's ID is " + studentID + ", University name is " + universityName);
    }

}
