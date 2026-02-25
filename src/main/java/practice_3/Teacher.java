package practice_3;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Teacher's name is " + name + ", the subject is " + subject);
    }
}
