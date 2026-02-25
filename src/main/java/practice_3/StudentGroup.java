package practice_3;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String name, int count) {
        this.groupName = name;
        this.studentCount = count;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setGroupName(String newName) {
        this.groupName = newName;
    }

    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Group name is " + groupName + ", count of students is " + studentCount);
    }
}
