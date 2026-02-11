package practice_3;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    StudentGroup(String name, int count) {
        this.groupName = name;
        this.studentCount = count;
    }

    String getGroupName() {
        return this.groupName;
    }

    int getStudentCount() {
        return this.studentCount;
    }

    void setGroupName(String newName) {
        this.groupName = newName;
    }

    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    void printInfo() {
        System.out.println("Group name is " + groupName + ", count of students is " + studentCount);
    }
}
